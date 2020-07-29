package structurals.composite

/**
 * Problem: Currently a writer is asked to write different sheets,
 * for each sheet he writes he receives a different amount
 * and he is also asked to write a book, but the number of sheets the book has is unknown,
 * but it is required at some point to request the price, either the individual sheet or the book.
 */
fun main(args: Array<String>) {
        val firstSheet: AbstractComposite = Sheet(10)

        println("Sheet amount ${firstSheet.getAmount()}")

        val secondSheet: AbstractComposite = Sheet(2)
        val thirdSheet: AbstractComposite = Sheet(3)

        val book: AbstractComposite = Book()

        book.addSheet(firstSheet)
        book.addSheet(secondSheet)
        book.addSheet(thirdSheet)

        println("Book amount ${book.getAmount()}")
    }
