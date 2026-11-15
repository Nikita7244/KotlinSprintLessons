package lesson_5

fun main() {
    val knownNum: List<Int> = (0..42).shuffled().take(3)
    val inputNum: MutableList<Int> = mutableListOf<Int>()

    println("угадайте три числа от 0 до 42. Удачи!")
    println("Введите первое число")
    inputNum.add(readln().toInt())

    println("Введите второе число")
    inputNum.add(readln().toInt())

    println("Введите третье число")
    inputNum.add(readln().toInt())

    val guessed = knownNum.intersect(inputNum.toSet()).size

    when (guessed) {
        1 -> println("Вы угадали одно число. Получите утешительный приз.")
        2 -> println("Вы угадали два числа. Получите крупный приз.")
        3 -> println("Вы угадали все числа. Вы выиграли Джекпот!")
        else -> println("Вы не угадали ни одного числа :(")
    }

    println("Загаданные числа: ${knownNum.get(0)}, ${knownNum.get(1)}, ${knownNum.get(2)}")
}
