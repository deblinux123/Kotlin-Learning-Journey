fun main()
{
    var favoriteActor: String? = null

    if (favoriteActor != null)
    {
        println("My favorite actor is ${favoriteActor!!.uppercase()} ")
    }
    else
    {
        println("You did not have any favorite actor")
    }

    var userName: String? = null

    val lengthOfName = if (userName != null)
    {
        userName.length
    }
    else
    {
        0
    }

    println("User name is $userName with length of $lengthOfName")

    // elvis
    var name: String? = "farid kaki"

    val yourName = name?.uppercase() ?: "Unknown name"

    println("Your name is $yourName")

    var myFavoriteActor: String? = null

    val lengthOfFavorite = myFavoriteActor?.length ?: 0

    println("Your favorite actor name length is $lengthOfFavorite")
}