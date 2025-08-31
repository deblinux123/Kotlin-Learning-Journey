import sun.security.util.Password

fun main()
{
    val favoriteActor = null
    println(favoriteActor)

    var name: String = "Farid"
    name = "Asma"
    println(name)

//    var userName: String = "Testing"
//    userName = null
//    println(userName)

    var userName: String? = "Testing"
    userName = null
    println(userName)

    var password: String? = "password"
    println(password)

    password = null
    println(password)

    var number: Int? = 10
    println(number)
    number = null
    println(number)

    var myFavoriteActor: String? = "Sandra Oh"
    println(myFavoriteActor?.length)

    var firstName: String? = "Sam"
    println(firstName!!.uppercase())
}