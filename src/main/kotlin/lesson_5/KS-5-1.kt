package lesson_5

fun main() {

    val summandOne = 7
    val summandTwo = 456
    println("Проверка на бота. Введите результат выражения $summandOne + $summandTwo")
    val inputNum = readln().toIntOrNull()

    if (inputNum == (summandOne + summandTwo)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}
