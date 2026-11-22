package lesson_7

import kotlin.random.Random

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val charLow = ('a'..'z').toList()
    val charUpper = ('A'..'Z').toList()
    val charNum = ('0'..'9').toList()
    val charAll = listOf(charLow, charNum, charUpper)
    var lengthPass: Int

    do {
        println("Введите необходимую длину пароля. Минимум $MIN_PASSWORD_LENGTH символов")
        lengthPass = readln().toInt()
    } while (lengthPass < MIN_PASSWORD_LENGTH)

    var password = ""
    for (i in 1 .. lengthPass) {
        password += charAll[Random.nextInt(3)].random()
    }

    println("Сгенерированный пароль: $password")
}
