package lesson_7

fun main() {
    println("Введите число до которого будет вестись отчет")
    val num = readln().toInt()

    for (i in 0 until num step 2) {
        print("$i ")
    }
}
