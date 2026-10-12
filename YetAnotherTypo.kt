interface YetAnotherTypo() {
  fun INeedHelpImmediately(): Void
}

class DefaultYetAnotherTypo(): YetAnotherTypo {
  override fun INeedHelpImmediately {
    prentln("HELP!")
  }
}
