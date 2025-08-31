fun main()
{
    val trafficLightColor = "Black"
    when(trafficLightColor)
    {
        "Red" -> println("Stop")
        "Green" -> println("Go")
        "Yellow" -> println("Slow")
        else -> println("Invalid traffic light color")
    }

    val x: Any = 13
    when(x)
    {
        2, 3, 5, 7-> println("Odd")
        in 10..20 -> println("The number between 10 and 20")
        is Int -> println("The number is an integer")
        else -> println("Even")
    }

    val age: Int = 18

    val message =
        if (age == 18) "You are 18 years old"
        else if (age < 18) "You are too young"
        else if (age > 18) "You are older than young"
        else "Invalid age"

    println(message)
}