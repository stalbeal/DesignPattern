package decorator

abstract class AbstractComputer {
    abstract fun calculateCost(): Float
}

abstract class AbstractComponentDecorator : AbstractComputer() {
    abstract override fun calculateCost(): Float
}
