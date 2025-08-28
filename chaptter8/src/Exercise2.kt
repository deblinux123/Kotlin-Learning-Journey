class Audio(override val title: String, val composer: String): Media
{
    override fun play()
    {
        println("Playing audio: $title, composed by $composer")
    }
}

fun main()
{
    val audio = Audio("Michael Jackson", "Michael Jackson")
    audio.play()
}