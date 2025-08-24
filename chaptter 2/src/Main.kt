//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
    println(shapes.first())
    println(shapes.last())

    val names: MutableList<String> = mutableListOf("farid", "Ali", "babak", "mobina", "asma")
    println(names)
    println(names.first())
    println(names.last())

    names.addFirst("firstItem")
    names.addLast("AddLast")
    names.add(2, "secondItem")
    println(names)

}