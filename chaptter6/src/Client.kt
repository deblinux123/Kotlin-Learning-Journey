class Client()
{
    var token: String? = null
    fun connect() = println("Connected")
    fun authenticate() = println("Authenticate")
    fun getData(): String = "Mock Data"
}

val client = Client().apply {
    token = "asdf"
    connect()
    authenticate()
}

fun main()
{
    println(client.getData())
}