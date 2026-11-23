package lesson_8

fun main() {
    println("Введите количество ингредиентов в списке")
    val ingrNum = readln().toInt()

    val ingredients = Array(ingrNum) {
        println("Введите ингредиент №${it + 1}")
        readln().lowercase()
    }

    println("Итоговый список: ${ingredients.joinToString(", ")}")
}
