package facade

fun main(args: Array<String>) {

    val shapeMakerFacade = ShapeMakerFacade()

    shapeMakerFacade.drawCircle()
    shapeMakerFacade.drawRectangle()
    shapeMakerFacade.drawSquare()
}
