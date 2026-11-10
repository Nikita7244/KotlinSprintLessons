package lesson_3

fun main() {
    val inputStr: String = "D2-D4;0"
    val from: String = inputStr.split(";", "-")[0]
    val to: String = inputStr.split(";", "-")[1]
    val count: Int = inputStr.split(";", "-")[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $count")
}
