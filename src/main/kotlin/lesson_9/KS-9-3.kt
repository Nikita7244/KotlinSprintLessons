package lesson_9

fun main() {
    val quantity = mutableListOf<Int>(2, 50, 15)

    println("Сколько порций хотите?")
    val count = readln().toInt()

    quantity.forEachIndexed { index, it ->
        quantity[index] = it * count
    }

    println("На $count порций вам понадобится: Яиц – ${quantity[0]} шт., молока – ${quantity[1]} мл, сливочного масла – ${quantity[2]} гр")
}
