package creationals.singleton

fun main(args: Array<String>) {
    println("Hash Code")
    SingletonInKotlin.showMessage()
    SingletonInKotlin.showMessage()

    println("Hash Code")
    SingletonLikeJava.instance.showMessage()
    SingletonLikeJava.instance.showMessage()

}