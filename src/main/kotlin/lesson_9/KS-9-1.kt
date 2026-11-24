package lesson_9

fun main() {
    val ingredients = listOf("помидор", "яйцо", "соль", "бекон")

    println("В рецепте есть следующие ингредиенты:")

    ingredients.forEach { println(it) }
}
