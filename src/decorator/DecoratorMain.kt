package decorator

object DecoratorMain {
    @JvmStatic
    fun main(args: Array<String>) {
        var gammerPC: AbstractComputer
        gammerPC = BaseComputer()
        gammerPC = LotOfRAM(gammerPC)
        gammerPC = FastSSD(gammerPC)
        gammerPC = BigProcessor(gammerPC)
        println("Total Cost is ${gammerPC.calculateCost()}")//Total Cost is 420.2
    }
}