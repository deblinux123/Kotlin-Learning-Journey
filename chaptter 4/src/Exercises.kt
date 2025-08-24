import kotlin.math.PI

fun main()
{
    println(circleArea(10))
    println(circlearea2(13))
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 20, seconds = 10))
    println(intervalInSeconds(hours = 2, seconds = 12))
}


// Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
fun circleArea(radius: Int): Double
{
    return PI * radius * radius
}


fun circlearea2 (radius: Int): Double = PI * radius * radius


fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0 ): Int
{
    return ((hours * 60) + minutes) * 60 + seconds
}