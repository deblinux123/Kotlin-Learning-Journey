class Canvas {
    fun driveCircle() = println("Drawing a circle")
    fun drawSquare() = println("Drawing a square")
}

fun render(block: Canvas.() -> Unit): Canvas {
    val canvas = Canvas()
    canvas.block()
    return canvas
}


fun main()
{
    render {
        drawSquare()
        driveCircle()
    }
}