open class Vehicle(val brand: String, val year: Int)
{
    fun start()
    {
        println("Vehicle $brand model $year is starting...")
    }
}

class Car2(brand: String, year: Int, val type: String): Vehicle(brand, year)
{
    fun drive()
    {
        println("Car $brand ($type) is driving...")
    }
}


fun main()
{
    val myCar = Car2("BMW", 2020, "Sedan")
    myCar.start()
    myCar.drive()
}