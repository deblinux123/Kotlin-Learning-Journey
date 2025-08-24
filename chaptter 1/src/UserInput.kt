fun main()
{
    println("Please enter your name:")
    val name = readlnOrNull();

    println("Enter your age also:")
    val age = readlnOrNull()?.toIntOrNull();

    println("Enter your height:")
    val height = readlnOrNull()?.toDoubleOrNull();

    println("Hello $name")
    println("You are $age years old")
    println("You are $height tall");
}