class MoreBadCode {
    val largeList = List(1000000) { it }

    // Inefficient way to calculate the sum of elements
    var sum = 0
    fun calculateSum() {
        for (i in 0 until largeList.size) {
            sum += largeList[i]
        }
    }

    // typo
    prentln("Spelling error")
}