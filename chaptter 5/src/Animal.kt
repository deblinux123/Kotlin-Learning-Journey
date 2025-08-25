open class Animal(val name: String, val age: Int)
{
    open fun sound()
    {
        println("Animal make sound")
    }
}


class Dog(name: String, age: Int): Animal(name, age)
{
    override fun sound() {
        println("$name make meow meow sound")
    }
}

class Cat(name: String, age: Int): Animal(name, age)
{
    override fun sound() {
        super.sound()
        println("$name make meow meow sound")
    }
}
fun main()
{
//    val dog = Dog("jack", 2)
//    val cat = Cat("blue", 3)
//
//    dog.sound()
//    cat.sound()

    // polymorphism

    val animals: List<Animal> = listOf(
        Dog("jack", 1),
        Cat("blue", 2)
    )

    for (animal in animals)
    {
        animal.sound()
    }
}