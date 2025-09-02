fun main()
{
    val coins: (Int) -> String = { "$it quarter" }
    val cupcake: (Int) -> String = { "Have a cupcake" }

    val treatFunction = treatOrTreak(false,coins)
    val trickFunction = treatOrTreak(true, null)

    treatFunction()
    trickFunction()

    repeat(4)
    {
        treatFunction()
    }
    trickFunction()
}

val trick =
    {
        println("No treats!")
    }

val treat: () -> Unit = {
    println("have treat!")
}

fun treatOrTreak(isTreak: Boolean, extraTreat: ((Int) -> String)?): () -> Unit
{
    if(isTreak)
    {
        return trick
    }
    else
    {
        if (extraTreat != null)
        {
            println(extraTreat(4))
        }
        return treat
    }
}