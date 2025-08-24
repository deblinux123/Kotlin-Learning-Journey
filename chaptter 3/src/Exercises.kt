fun main()
{
    var pizzaSlice = 0
    pizzaSlice++

    do {
        println("There's only $pizzaSlice slice/s of pizza :(")
        pizzaSlice++
    }while (pizzaSlice < 8)

    println("There ate $pizzaSlice slice of pizza. hooray! :D")


    // fizzbuzz game
    var fizzBuzz = 0

    while (fizzBuzz < 100)
    {
        if(fizzBuzz % 15 == 0)
        {
            println("$fizzBuzz -> fizzbuzz")
        }else if (fizzBuzz % 5 == 0)
        {
            println("$fizzBuzz -> buzz")
        }
        else if (fizzBuzz % 3 == 0)
        {
            println("$fizzBuzz -> fizz")
        }else
        {
            println(fizzBuzz)
        }

        fizzBuzz++
    }

    // print only names that start with a
    var names = listOf("ali", "lila", "ahmad", "Farid", "farid", "Amir", "asma")

    for (name in names)
    {
        if (name.startsWith('a'))
        {
            println("$name start with letter 'a'")
        }
    }
}