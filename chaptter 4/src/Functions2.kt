fun main()
{
    val greeting = birthdayGreeting()
    println(greeting)

    println(personlInformation("farid", 32))
    println(personlInformation("asma", 28))
    println(add2(12, 12))
    println(add2(20))
}


fun birthdayGreeting(): String
{
    val nameGreeting = "happy birthday, Farid"
    val ageGreeting = "you are now 32 years old"

    return "$nameGreeting\n$ageGreeting"
}

fun personlInformation(name: String, age: Int): String
{
    return "$name\n$age"
}

fun add2(x: Int, y:Int = 10): Int
{
    return x + y
}
