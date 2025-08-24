fun main()
{
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kivi" to 200, "orange" to 300)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kivi" to 200, "orange" to 300)
    println(juiceMenu)

    println("The value of apple juice is : ${readOnlyJuiceMenu["apple"]}")

    val information: MutableMap<String, Int> = mutableMapOf("ali" to 78, "reza" to 60, "farid" to 67)
    information["asma"] = 100

    println(information)

    println(information.keys)
    println(information.values)

    println("farid" in information)
    println(100 in information.values)


}