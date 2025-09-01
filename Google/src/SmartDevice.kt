class SmartDevice(val name: String, val category: String)
{
    var deviceStatus = "Online"

    constructor(): this(name= "Android Tv", category = "Enterprise")
    {
        println("Secondary constructor\nname -> $name category -> $category")
    }

    constructor(name: String) : this(name, "Utility")
    {
        println("Secondary constructor\nname -> $name category -> $category")
    }

    fun turnOn()
    {
        println("$name is turned on")
    }

    fun turnOff()
    {
        println("$name is turned off")
    }
}

fun main()
{
    val smartDevice = SmartDevice("Android TV", "Entertainment")
    println("Device name is : ${smartDevice.name}")
    smartDevice.turnOn()
    smartDevice.turnOff()

    val newSmartDevice = SmartDevice()
    newSmartDevice.turnOn()

    val oneParameterSmartDevice = SmartDevice("Android Phone")
    oneParameterSmartDevice.turnOn()
}