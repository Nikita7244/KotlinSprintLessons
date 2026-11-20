package lesson_6

fun main() {
    val guessedNumber = (1..9).random()

    println("Угадайте число. У Вас есть 5 попыток")
    var attempt = 5

    while (attempt > 0) {
        println("Введите число")
        val inputNum = readln().toInt()

        if (inputNum == guessedNumber) {
            println("Это была великолепная игра!")
            break
        }
        else{
            println("Неверно. Осталось число попыток ${--attempt}")
        }
    }

    if (attempt == 0) println("Было загадано число $guessedNumber")
}
