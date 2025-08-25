fun main()
{
    hello()
    sum(12, 3)
    sum(12, 3, 4)
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    add(12,12)
    add(b = 10, a = 10)
    println(multiplication(12, 2))
}

fun hello()
{
    return println("Hello this is my first function")
}


// unit return nothing
fun sum(x: Int, y: Int): Unit {
    println(x + y)
}

// return int value
fun sum(x: Int, y: Int, z: Int): Int {
    return x + y + z
}

// named argument
fun printMessageWithPrefix(message: String, prefix: String)
{
    println("[$prefix] $message")
}

// default paramter
fun add(a: Int = 5, b: Int = 12)
{
    println(a + b)
}

fun multiplication(x: Int, y: Int): Int = x + y