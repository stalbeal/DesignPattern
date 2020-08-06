package behaviorals.strategy

class Printer(private val formatterStrategy: PrintingStrategy) {
    fun printString(text: String) {
        println(formatterStrategy.apply(text))
    }
}

