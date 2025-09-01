import kotlin.io.path.fileVisitor
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

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

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

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


class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
): ReadWriteProperty<Any?, Int>
{
    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue)
        {
            fieldData = value
        }
    }
}
fun main()
{
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Enterprise")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}