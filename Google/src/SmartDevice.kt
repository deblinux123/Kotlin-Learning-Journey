import kotlin.io.path.fileVisitor

open class SmartDevice(val name: String, val category: String)
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

    open fun turnOn()
    {
        deviceStatus = "on"
    }

    open fun turnOff()
    {
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel()
    {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn()
    {
        super.turnOn()
        println("$name turned on speaker volume is set to " +
                "$speakerVolume. and channel number set to " +
                "$channelNumber.")
    }

    override fun turnOff()
    {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String): SmartDevice(name = deviceName, category = deviceCategory)
{
    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightnessLevel()
    {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel.")
    }

    override fun turnOn()
    {
        super.turnOn()
        brightnessLevel = 10
        println("$name turned on, Brightness level is $brightnessLevel.")
    }

    override fun turnOff()
    {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off, Brightness level is $brightnessLevel.")
    }
}

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice,
)
{
    fun turnOnTv()
    {
        smartTvDevice.turnOn()
    }

    fun turnOffTv()
    {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume()
    {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext()
    {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight()
    {
        smartLightDevice.turnOn()
    }

    fun turnOffLight()
    {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness()
    {
        smartLightDevice.increaseBrightnessLevel()
    }

    fun turnOffAllDevice()
    {
        turnOffTv()
        turnOffLight()
    }
}

fun main()
{
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Enterprise")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}