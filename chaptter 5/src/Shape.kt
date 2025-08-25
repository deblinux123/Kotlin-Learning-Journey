import kotlin.math.PI

open class Shape {
    open fun area(): Double
    {
        return 0.0
    }
}

class Circle(private val radius: Double): Shape()
{
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double): Shape()
{
    override fun area(): Double {
        return width * height
    }
}


fun main()
{
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Rectangle(2.3, 4.5)
    )

    for (shape in shapes)
    {
        println("Area -> ${shape.area()}")
    }
}