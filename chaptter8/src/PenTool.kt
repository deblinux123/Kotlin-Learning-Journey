class PenTool: DrawingTool
{
    override val color: String = "Black"

    override fun draw(shape: String) {
        println("Drawing $shape using a pen in $color")
    }

    override fun erase(area: String) {
        println("Erase $area using a pen tool")
    }

    override fun getToolInfo(): String {
        return "PenTool(Color=$color)"
    }
}

class CanvasSession(val tool: DrawingTool): DrawingTool by tool
{
    override val color: String = "Blue"
}

fun main()
{
    val pen = PenTool()
    val session = CanvasSession(pen)

    println("Pen color: ${pen.color}")
    println("Session color: ${session.color}")
    session.draw("circle")
    session.erase("top-left corner")

    println(session.getToolInfo())
}