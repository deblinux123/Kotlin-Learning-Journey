class Car(var brand:String, var year:Int)
{
    fun drive(): Unit {
        println("Car $brand model $year is driving")
    }
}


fun main()
{
    val bmw = Car("BMW", 1990)
    bmw.drive()
}