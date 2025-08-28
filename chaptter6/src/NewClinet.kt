class NewClinet()
{
    val token: String? = null
    fun connected() = println("Connected")
    fun authenticated() = println("Authenticated")
    fun getData(): String = "Mock Data"
}


val clinet: Client = Client().apply {
    token = "asdf"
}

fun main()
{
    val result: String = clinet.run {
        connect()
        authenticate()
//        getData()
        println(getData()).toString()
    }
}