fun sendNotification(recipientAddress: String): String
{
    println("Yo $recipientAddress!")
    return "Notification sent!"
}


fun getNextAddress(): String
{
    return "ifo@gmail.com"
}

fun main()
{
    val address: String? = getNextAddress()
    val confrim = address?.let {
        sendNotification(it)
    }
}