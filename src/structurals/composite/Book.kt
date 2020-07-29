package structurals.composite

class Book : AbstractComposite() {
    private var sheetsList = ArrayList<AbstractComposite>()

    override fun getAmount(): Int {
        return sheetsList.sumBy {
            it.getAmount()
        }
    }

    override fun addSheet(composite: AbstractComposite) {
        sheetsList.add(composite)
    }

}