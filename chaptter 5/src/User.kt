class User(val name: String, val age: Int) {}

fun main()
{
    val user = User("Farid", 39)
    println(user.name)
    println(user.age)

    val newUser = User("Babak", 29)

    println("user == new user : ${user.equals(newUser)}")
}