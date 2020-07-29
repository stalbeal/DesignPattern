package structurals.composite

abstract class AbstractComposite {

    abstract fun getAmount(): Int

    abstract fun addSheet(composite: AbstractComposite)

}

