fun Int.isPositive(): Boolean = this > 0

fun Int.isEven(): Boolean = this % 2 == 0



fun String.toLowercaseString(): String = this.lowercase()

fun main()
{
    println(1.isPositive())
    println(2.isEven())
    println("HELLO WORLD".toLowercaseString())
}