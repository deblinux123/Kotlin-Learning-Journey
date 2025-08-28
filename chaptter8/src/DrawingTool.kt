interface DrawingTool
{
    val color: String
    fun draw(shape: String)
    fun erase(area: String)
    fun getToolInfo(): String
}