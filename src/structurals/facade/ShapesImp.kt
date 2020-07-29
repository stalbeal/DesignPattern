package structurals.facade

class Circle : Shape {
    override fun draw() {
        println("Circle::draw()")
    }

}

class Square : Shape {
    override fun draw() {
        println("Square::draw()")
    }
}

class Rectangle : Shape {
    override fun draw() {
        println("Rectangle::draw()")
    }
}

