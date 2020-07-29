package structurals.bridge

fun main(args: Array<String>) {
    val circle: AbstractShape = Circle(Black())
    circle.draw()
    circle.color = Red()
    circle.draw()
    val square : AbstractShape = Square(Red())
    square.draw()
}
