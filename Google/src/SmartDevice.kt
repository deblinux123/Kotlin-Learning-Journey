import kotlin.io.path.fileVisitor

open class SmartDevice (val name: String, val category: String)
{
    var deviceStatus = "Online"
        protected set

    open val deviceType = "Unknown"

    protected constructor(): this(name= "Android Tv", category = "Enterprise")
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

    override val deviceType = "Smart TV"

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
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

class SmartLightDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory)
{
    override val deviceType = "Smart Light"

    private var brightnessLevel = 0
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
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv()
    {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
        smartTvDevice.name
    }

    fun turnOffTv()
    {
        deviceTurnOnCount--
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
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight()
    {
        deviceTurnOnCount--
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