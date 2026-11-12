package lesson_5

const val INTER_NUM = 7 + 456

fun main() {
    println("Проверка на бота. Введите результат выражения 7 + 456")
    val inputNum = readln().toIntOrNull()

    if (inputNum == INTER_NUM) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}
