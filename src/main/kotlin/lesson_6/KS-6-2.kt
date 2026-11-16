package lesson_6

fun main() {
    println("Введите количество секунд ожидания")
    var sec = readln().toInt()

    while (sec > 0) {
        Thread.sleep(1000)
        sec--
    }
}
