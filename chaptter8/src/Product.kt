abstract class Product(val name:String, var price: Double)
{
    abstract val category: String

    fun productInfo(): String
    {
        return "Product: $name, Category: $category, Price: $price"
    }
}


class Electronic (name: String, price: Double, val warranty: Int): Product(name, price)
{
    override val category = "Electronic"
}

class Education(name: String, title: String, page: Int, price: Double): Product(name, price)
{
    val title = title
    val page = page
    override val category = "Education"
    fun educationInformation(): String
    {
        return "Title: $title,\nPage: $page"
    }
}

fun main()
{
    val laptop = Electronic(name = "Laptop", price = 120.0, warranty = 2)
    println(laptop.productInfo())

    val kotlin = Education(name = "Kotlin in action", title = "Expert guidance and amazing examples from Kotlin core developers! It’s everything you need to get up and running fast.", page = 330, price = 43.31)
    println(kotlin.productInfo())
    println(kotlin.educationInformation())
}