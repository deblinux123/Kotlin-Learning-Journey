val registerUserNames = mutableListOf("Farid kaki","Asma azizi")

val registeredEmail = mutableListOf("Farid@gmail.com", "asma@email.com")

fun registerUser(username: String, email: String): String
{
    if (username in registerUserNames)
    {
        return "Username already taken."
    }

    if (email in registeredEmail)
    {
        return "Email already taken"
    }

    registerUserNames.add(username)
    registeredEmail.add(email)

    return "User Registered Successfully: $username"
}


fun main()
{
    println(registerUser("alireza", "alireza@email.com"))
    println(registerUser("Asma azizi", "asma@gmail.com"))
}