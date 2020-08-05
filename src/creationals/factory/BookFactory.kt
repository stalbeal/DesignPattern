package creationals.factory

class BookFactory(genre: Genre) {
    companion object {
        fun createBook(genre: Genre) : Book = when (genre) {
            Genre.SCIENCE -> object :
                Book {

                override fun getInfo() {
                    println("I'm a ${Genre.SCIENCE} book")
                }

                override fun order() {
                    println("You order a ${Genre.SCIENCE} book")
                }

                override fun rate() {
                    println("You rate a ${Genre.SCIENCE} book")
                }

            }
            Genre.LITERATURE -> object :
                Book {
                override fun getInfo() {
                    println("I'm a ${Genre.LITERATURE} book")
                }

                override fun order() {
                    println("You order a ${Genre.LITERATURE} book")
                }

                override fun rate() {
                    println("You rate a ${Genre.LITERATURE} book")
                }

            }
        }
    }
}