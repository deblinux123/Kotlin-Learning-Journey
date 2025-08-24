//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    // variable
    val PI: Double = 3.14
    var age: Int = 24
    var myName = "Farid"


    println(PI)
    println(age)
    println(myName);

    val language: String = "Kotlin"
    println("I love $language")

    val a: Int = 10;
//    a = 12 cant change

    var b: Float = 12.3F

    b = 12.4F

    println("The new value for b is $b")

    val country: String = "Iran"

    println("I live in $country")


    // Data type in kotlin

    val myAge: Int = 23
    val userName: String = "Mu UserName"
    val isStudent: Boolean = true

    println(isStudent)
    println(userName)
    println(myAge)

}