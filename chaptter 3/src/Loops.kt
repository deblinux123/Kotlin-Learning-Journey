fun main()
{
    for (number in 1..10)
    {
        println("Number $number")
    }

    val names = listOf("farid", "ali", "ahmad", "reza", "asma")

    for (name in names)
    {
        println("Name $name")
    }

    var continueGame = 0

    while(continueGame < 3)
    {
        println("count $continueGame")
        continueGame++
    }

    println("do while loop")

    var cakceEaten = 0

    do {
        println("Bake cake")
        cakceEaten++
    }while (cakceEaten < 4)


}