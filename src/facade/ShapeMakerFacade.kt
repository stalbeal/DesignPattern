package facade

class ShapeMakerFacade {

    private var circle: Shape = Circle()
    private var square: Shape = Square()
    private var rectangle: Shape = Rectangle()

    fun drawCircle(){
        circle.draw()
    }

    fun drawSquare(){
        square.draw()
    }

    fun drawRectangle(){
        rectangle.draw()
    }
}