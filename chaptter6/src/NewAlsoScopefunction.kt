fun main()
{
    val names: List<String> = listOf("Farid",
                                     "babak",
                                     "ahmad",
                                     "Asma")
    val reversedLongUppercaseNames: List<String> =
        names
            .map { it.uppercase() }
            .also { println(it) }
            .filter { it.length > 4 }
            .also { println(it) }
            .reversed()

    println(reversedLongUppercaseNames)
}