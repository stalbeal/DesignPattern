package creationals.builder

fun main(args: Array<String>) {
    val car = Car.Builder().year(2020).build()

    println(car.model) //print null
    println(car.year) //print 2020
}