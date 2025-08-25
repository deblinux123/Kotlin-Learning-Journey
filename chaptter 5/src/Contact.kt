class Contact (val id: Int, var email:String)
{
    val category: String = "Work"

    fun printInformation()
    {
        println("Id -> $id\nEmail -> $email")
    }
}


fun main()
{
    val contact = Contact(12, "inf@gmail.com")
    println(contact.id)
    println(contact.email)
    contact.printInformation()

    contact.email = "farid@gmail.com"

    println(contact.email)
}