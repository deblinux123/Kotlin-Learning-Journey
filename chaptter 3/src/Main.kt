import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val d: Int
    val check: Boolean = true

    if (check)
    {
        d = 1
    }
    else
    {
        d = 2
    }

    println(d)

    println("Please enter your password: ")
    val pasword: String = readlnOrNull()!!

    if (pasword.equals("myPass"))
    {
        println("Loged in.")
    }
    else
    {
        println("Wrong Password.")
    }

    val number = 2

    when(number)
    {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> println("invalid one")
    }

    println("Enter your age: ")
    val age= readlnOrNull()?.toIntOrNull()
    when (age)
    {
        in 0..12 -> println("Child")
        in 13..19 -> println("young")
        in 20..50 -> println("middle age")
        else -> println("Old")
    }

    val trafficLightState: String = "red"

    val trafficAction = when
    {
        trafficLightState.equals("green") -> "go"
        trafficLightState.equals("yellow") -> "slow down"
        trafficLightState.equals("red") -> "stop"
        else -> "Malfunction"
    }

    println(trafficAction)


    // import kotlin.random.Random

    val firstResult = Random.nextInt(6);
    val secondResult = Random.nextInt(6);

    if (firstResult.equals(secondResult))
    {
        println("You win")
    }
    else
    {
        println("You lose")
    }

    val button: Char = 'A'


    val result: String = when (button)
    {
        'A' -> "yes"
        'B' -> "No"
        'X' -> "Menu"
        'Y' -> "Nothing"
        else -> "There is no such button"
    }

    println(result)

}