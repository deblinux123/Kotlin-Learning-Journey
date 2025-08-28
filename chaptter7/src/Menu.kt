class MenuItem(val name: String)

class Menu (val name: String)
{
    val items = mutableListOf<MenuItem>()

    fun item(name: String)
    {
        items.add(MenuItem(name))
    }
}

fun menu(name: String, init: Menu.() -> Unit): Menu {
    val menu = Menu(name)
    menu.init()

    return menu
}

fun printMenuItem(menu: Menu)
{
    println("Menu: ${menu.name}")
    menu.items.forEach {
        println("Item: ${it.name}")
    }
}


fun main()
{
    val mainMenu = menu("Main Menu")
    {
        item("Home")
        item("Settings")
        item("Exit")
    }

    printMenuItem(mainMenu)
}