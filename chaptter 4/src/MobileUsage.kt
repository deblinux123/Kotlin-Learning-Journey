fun main()
{
    val result: Boolean = mobileUsageComapre(2300, 12340)
    println("Today More use your mobile: $result")
    cityInformation("tokyo", 25, 32, 82)
    cityInformation("Cape Town", 59, 64, 2)
}

fun mobileUsageComapre(timeSpendYesterday: Int, timeSpendToday:Int): Boolean
{
    if (timeSpendToday > timeSpendYesterday)
    {
        return true
    }

    return false
}

fun cityInformation(city: String,
                    lowTemperature: Int,
                    highTemperature: Int,
                    chanceOfRain: Int)
{
    println("=============================================")
    println("City: $city\n" +
            "Low Temperature: $lowTemperature\n" +
            "High Temperature: $highTemperature\n" +
            "Chance Of Rain: $chanceOfRain%")


}