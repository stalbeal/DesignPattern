package structurals.flyweight

fun main(args: Array<String>) {
    val flyweightFactory = FlyweightFactory()
    val patents = arrayOf("ARG123", "CHL123", "PER123")
    val colors = arrayOf("White", "Brown", "Pink")
    val owners = arrayOf("Buzz", "Woody", "Hamm")

    flyweightFactory.listVehicles(colors, patents, owners)

}
