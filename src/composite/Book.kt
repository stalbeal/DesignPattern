package composite

class Book : AbstractComposite() {
    private var amount: Int = 0
    private var sheetsList = ArrayList<AbstractComposite>()

    override fun getAmount(): Int {
        return amount
    }

    override fun addSheet(composite: AbstractComposite) {
        amount += composite.getAmount()
        sheetsList.add(composite)
    }

}