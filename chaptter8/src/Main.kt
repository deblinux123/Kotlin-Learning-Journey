class Car(val make: String, val model: String, val numberOdDoors: Int)


fun main()
{
    val car1 = Car("Toyota", "Crolla", 4)
    println("Car 1: Make: ${car1.make}, Model: ${car1.model}, Number Of Doors: ${car1.numberOdDoors}")
}