fun main()
{
    printNotificationSummary(23)
    printNotificationSummary(156)
}

fun printNotificationSummary(numberOfMessages: Int)
{
    if (numberOfMessages < 99)
    {
        println("You have $numberOfMessages notifications.")
    }
    else
    {
      println("Your phone is blowing up! you have 99+ notifications.")
    }
}