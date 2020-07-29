package creationals.decorator

class FastSSD(computer: AbstractComputer) : AbstractComponentDecorator() {

    private var currentComputer: AbstractComputer = computer


    override fun calculateCost(): Float {
        return this.currentComputer.calculateCost() + 200.20f
    }

}

class BigProcessor(computer: AbstractComputer) : AbstractComponentDecorator() {

    private var currentComputer: AbstractComputer = computer

    override fun calculateCost(): Float {
        return this.currentComputer.calculateCost() + 120.00f
    }

}

class BaseComputer() : AbstractComponentDecorator() {

    override fun calculateCost(): Float {
        return 0f
    }

}

class LotOfRAM(computer: AbstractComputer) : AbstractComponentDecorator() {

    private var currentComputer: AbstractComputer = computer


    override fun calculateCost(): Float {
        return this.currentComputer.calculateCost() + 100.00f
    }

}

