package lesson_6

fun main() {
    println("Введите количество секунд ожидания")
    var sec = readln().toInt()

    do {
        Thread.sleep(1000)
        println("Осталось секунд: ${sec--}")
    } while (sec > 0)
    println("Время вышло")
}
