package lesson_3

fun main() {
    var from: String = "E2"
    var to: String = "E4"
    var count: Int = 0

    println("$from-$to:${++count}")

    from = "D2"
    to = "D3"

    println("$from-$to:${++count}")
}
