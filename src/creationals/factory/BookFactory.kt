package creationals.factory

class BookFactory(genre: Genre) {
    companion object {
        fun createBook(genre: Genre) : Book = when (genre) {
            Genre.SCIENCE -> BookImpl(genre)
            Genre.LITERATURE -> BookImpl(genre)
        }
    }
}