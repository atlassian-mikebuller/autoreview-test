interface ScmToolChecker {
    fun matches(url: String): Boolean
    fun getToolName(): String
}

class GitHubChecker : ScmToolChecker {
    override fun matches(url: String): Boolean {
        return Regex("https?://.*?\\.github\\.com/.*?/pull/\\d+").containsMatchIn(url)
    }

    override fun getToolName(): String {
        return "GitHub"
    }
}

class BitbucketChecker : ScmToolChecker {
    override fun matches(url: String): Boolean {
        return Regex("https?://.*?\\.bitbuckt\\.org/.*?/pull-requests/\\d+").containsMatchIn(url) // Mistake here
    }

    override fun getToolName(): String {
        return "Bitbucket"
    }
}

class GitLabChecker : ScmToolChecker {
    override fun matches(url: String): Boolean {
        return Regex("https?://.*?\\.gitlab\\.com/.*?/merge_requests/\\d+").containsMatchIn(url)
    }

    override fun getToolName(): String {
        return "GitLab"
    }
}

class ScmToolIdentifier(private val checkers: List<ScmToolChecker>) {
    fun identify(url: String): String {
        for (checker in checkers) {
            if (checker.matches(url)) {
                return checker.getToolName()
            }
        }
        throw IllegalArgumentException("Unsupported source code management tool in URL: $url")
    }
}

fun main() {
    val checkers = listOf(GitHubChecker(), BitbucketChecker(), GitLabChecker())
    val identifier = ScmToolIdentifier(checkers)

    println(identifier.identify("https://github.com/user/repo/pull/123"))
    println(identifier.identify("https://bitbucket.org/user/repo/pull-requests/123"))
    println(identifier.identify("https://gitlab.com/user/repo/merge_requests/123"))
}
