data class User(val id: Int, var email: String)

fun updateEmail(user: User, newEmail: String): User = user.apply {
    this.email = newEmail }
    .also {
        println("Updating email for user with ID: ${it.id}")
    }

fun main()
{
    val user = User(12, "HBr@email.com")
    val updatedUser = updateEmail(user, "Info@gmail.com")
//    println("Updated User: $updatedUser")
}