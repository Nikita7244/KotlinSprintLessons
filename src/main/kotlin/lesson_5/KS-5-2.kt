package lesson_5

const val MAJORITY_AGE = 18

fun main () {
    val yaer = 2026

    println("Введи год рождения")

    val yearBirthday: Int = readln().toInt()

    if ((yaer - yearBirthday) >= MAJORITY_AGE) println("Показать экран со скрытым контентом")
}
