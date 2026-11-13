package lesson_5

fun main() {
    val trueNumOne = 19
    val trueNumTwo = 35

    println("Угадайте первое число в диапазоне от 0 до 42")
    val inputNumOne = readln().toIntOrNull()

    println("Угадайте второе число в диапазоне от 0 до 42")
    val inputNumTwo = readln().toIntOrNull()

    val isNumOneGuess = when {
        inputNumOne == trueNumOne -> true
        inputNumTwo == trueNumOne -> true
        else -> false
    }

    val isNumTwoGuess = when {
        inputNumOne == trueNumTwo -> true
        inputNumTwo == trueNumTwo -> true
        else -> false
    }

    when {
        isNumOneGuess && isNumTwoGuess -> println("Поздравляем! Вы выиграли главный приз!")
        isNumOneGuess || isNumTwoGuess -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Правильные числа $trueNumOne и $trueNumTwo")
}
