package creationals.factory

fun main(args: Array<String>) {
    val genre = Genre.LITERATURE

    val book = BookFactory.createBook(genre)

    book.getInfo()
    book.order()
    book.rate()
}