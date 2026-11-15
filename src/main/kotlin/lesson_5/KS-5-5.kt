package lesson_5

fun main() {
    val knownNum: List<Int> = listOf<Int>((0..42).random(), (0..42).random(), (0..42).random())
    val inputNum: MutableList<Int> = mutableListOf<Int>()

    println("угадайте три числа от 0 до 43. Удачи!")
    println("Введите первое число")
    inputNum.add(readln().toInt())

    println("Введите второе число")
    inputNum.add(readln().toInt())

    println("Введите третье число")
    inputNum.add(readln().toInt())

    val guessed = knownNum.intersect(inputNum.toSet())

    when (guessed.size) {
        1 -> println("Вы угадали одно число. Получите утешительный приз.")
        2 -> println("Вы угадали два числа. Получите крупный приз.")
        3 -> println("Вы угадали все числа. Вы выиграли Джекпот!")
        else -> println("Вы не угадали ни одного числа :(")
    }

    println("Загаданные числа: ${knownNum.get(0)}, ${knownNum.get(1)}, ${knownNum.get(2)}")
}
