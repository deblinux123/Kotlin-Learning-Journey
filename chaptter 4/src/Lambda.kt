fun main()
{
    println(upperCaseString("this is the testing text"))
    // lambda expression
    val upperCase = { text: String -> text.uppercase()}
    println(upperCase("hello"))

    val numbers  = listOf(1, 2, 3, -4, 5, -6)
    val positives = numbers.filter({x -> x > 0})
    println(positives)


    val isNegative = {x: Int -> x < 0}
    val negatives = numbers.filter(isNegative)
    println(negatives)

    val names = listOf("farid", "babak", "asma", "ahmad", "reza", "ali")
    val startWithA = names.filter({name -> name.startsWith('a')})
    println(startWithA)

    val upperCaseNames = {name: String -> name.uppercase()}
    println(upperCaseNames("farid"))

    // map
    val myNumbers = listOf(1, -2, 4, -5, -7)

    val doubleed = myNumbers.map{x -> x * 2}

    val tripled = {x: Int -> x * 3}

    println(doubleed)
    println(myNumbers.map (tripled))

    val evenNumber = listOf(1, 2, 3, 4, 4, 5, 6)
    val isEven = evenNumber.map { x -> x % 2 == 0 }

    println(isEven)

    println(uppercaseString("This is the another type of functions"))

    val timesInMinute = listOf(2, 4, 10, 15)
    val min2sec = toSeconds("minute")
    val totalTimeInSecond = timesInMinute.sumOf(min2sec)
    println(totalTimeInSecond)

}

val uppercaseString: (String) -> String = {text -> text.uppercase()}

fun upperCaseString(text: String): String
{
    return text.uppercase()
}

fun toSeconds(time: String): (Int) -> Int = when (time)
{
    "hour"   -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "sedond" -> {value -> value}
    else     -> {value -> value}
}