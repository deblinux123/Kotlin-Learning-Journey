fun main()
{
    val greenNumbers = listOf(1, 2, 3, 4)
    val redNumbers = listOf(3, 4)

    val totalNumbers = greenNumbers.count() + redNumbers.count();

    println("Total Numbers: $totalNumbers")

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported: Boolean = requested.uppercase() in SUPPORTED

    println("Is Supported: $isSupported")

    val number2world = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as ${number2world[n]}")
}