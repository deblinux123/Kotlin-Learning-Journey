class BasicMessenger: Messenger
{
    override fun sendMessage(message: String) {
        println("Sending message: $message")
    }

    override fun receiveMessage(): String
    {
        return "You've got a new message!"
    }
}

class SmartMessenger(val basicMessenger: BasicMessenger): Messenger by basicMessenger
{
    override fun sendMessage(message: String)
    {
        println("Sending a smart message: $message")
        basicMessenger.sendMessage("[smart] $message")
    }
}

fun main()
{
    val basicMessenger = BasicMessenger()
    val smartMessenger = SmartMessenger(basicMessenger)

    basicMessenger.sendMessage("Hello Kotlin")
    println(smartMessenger.receiveMessage())
    smartMessenger.sendMessage("Hello from smart messenger")
}