fun main()
{
    val readOnlyFruit = setOf("Apple", "Banana", "cherry", "cherry")
    println(readOnlyFruit)

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(fruit)

    println("apple" in fruit)

    println("The fruit variable has only ${fruit.count()} items")

    val names: MutableSet<String> = mutableSetOf("Farid", "Babak", "Mobina")
    println(names)

    names.add("Asma")
    println(names)
    names.add("wrong one")
    println(names)

    names.remove("wrong one")
    println(names)
}