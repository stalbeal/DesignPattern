package creationals.factory

class BookImpl(private val genre: Genre) : Book {
    override fun getInfo() {
        println("I'm a $genre book")
    }

    override fun order() {
        println("You order a $genre book")
    }

    override fun rate() {
        println("You rate a $genre book")
    }
}