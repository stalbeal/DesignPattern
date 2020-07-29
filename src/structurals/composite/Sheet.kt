package structurals.composite

class Sheet(private var amount: Int) : AbstractComposite() {
    override fun getAmount(): Int {
        return amount
    }

    override fun addSheet(composite: AbstractComposite) {
        TODO("Not yet implemented")
    }
}