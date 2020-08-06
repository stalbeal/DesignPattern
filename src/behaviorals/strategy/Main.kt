package behaviorals.strategy

fun main(args: Array<String>) {
    var printer = Printer(LowerCaseFormatter())
    printer.printString("HeLlO")
    printer = Printer(UpperCaseFormatter())
    printer.printString("HeLlO")

}