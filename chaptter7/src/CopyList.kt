fun List<Int>.incremented(): List<Int>
{
    val originalList = this
    return buildList{
        for (n in originalList) add(n+1)
    }
}

fun main()
{
    val originalList = listOf(1, 2, 3, 4, 5, 6)
    val newList = originalList.incremented()
    println(newList)
}