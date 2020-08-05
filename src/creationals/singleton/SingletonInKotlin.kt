package creationals.singleton

/**
 * An object is just a data type with a thread-safe singleton implementation.
 */
object SingletonInKotlin {
    fun showMessage(){
        println("Singleton in kotlin ${this.hashCode()}")
    }
}