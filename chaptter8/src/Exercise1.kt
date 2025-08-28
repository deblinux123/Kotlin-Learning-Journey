abstract class SmartDevice(val name: String)
{
    abstract fun turnOn()
    abstract fun turnOff()
}

class SmartLight(name: String): SmartDevice(name)
{
    override fun turnOn() {
        println("$name Turning ON")
    }
    override fun turnOff()
    {
        println("$name Is Now OFF")
    }

    fun adjustBrightness(level: Int)
    {
        println("Adjusting $name Brightness $level%")
    }
}

class Thermostat(name: String): SmartDevice(name)
{
    override fun turnOn()
    {
        println("$name thermostat is now heating")
    }

    override fun turnOff()
    {
        println("$name thermostat is now off")
    }

    fun adjustTemperature(temperature: Int)
    {
        println("$name thermostat set to $temperature°C.")
    }
}

fun main()
{
    val livingRoomLight = SmartLight("Living Room Light")
    val bedroomThermostat = Thermostat("Bedroom Thermostat")

    livingRoomLight.turnOn()
    livingRoomLight.adjustBrightness(7)
    livingRoomLight.turnOff()

    bedroomThermostat.turnOn()
    bedroomThermostat.adjustTemperature(3)
    bedroomThermostat.turnOff()
}
