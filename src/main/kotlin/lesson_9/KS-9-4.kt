package lesson_9

fun main () {
    println("Введите список из пяти ингредиентов блюда")
    val inputList = readln().split(", ")

    val sortedList = inputList.sorted()

    println("Отсортированный список ингредиентов: ${sortedList.joinToString(", ")}")
}
