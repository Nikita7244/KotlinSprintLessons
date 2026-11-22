package lesson_7

import kotlin.random.Random

fun main() {
    val charLow = ('a'..'z').toList()
    val charUpper = ('A'..'Z').toList()
    val charNum = ('0'..'9').toList()
    val charAll = charLow + charNum + charUpper
    var lengthPass: Int

    do {
        println("Введите необходимую длину пароля. Минимум 6 символов")
        lengthPass = readln().toInt()
    } while (lengthPass < 6)

    var password = ""
    for (i in 1..lengthPass) {
        password += charAll[Random.nextInt(charAll.size)]
    }

    println("Сгенерированный пароль: $password")
}
