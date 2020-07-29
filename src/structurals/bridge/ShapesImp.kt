package structurals.bridge

class Circle(color: Color) : AbstractShape(color) {
    override fun draw() {
        color.paint()
    }
}

class Square(color: Color) : AbstractShape(color) {
    override fun draw() {
        color.paint()
    }
}