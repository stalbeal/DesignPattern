package behaviorals.strategy

class LowerCaseFormatter : PrintingStrategy {
    override fun apply(text: String): String {
        return text.toLowerCase()
    }

}

class UpperCaseFormatter : PrintingStrategy {
    override fun apply(text: String): String {
        return text.toUpperCase()
    }
}
