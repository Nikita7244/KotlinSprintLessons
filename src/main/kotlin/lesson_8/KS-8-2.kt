package lesson_8

fun main() {
    val ingredients = arrayOf("помидор", "яйцо", "соль", "бекон")

    println("Какой ингредиент вы хотите найти?")
    val inputIngredient = readln()

    for ((i, item) in ingredients.withIndex()) {
        if (item == inputIngredient.lowercase()) {
            println("Ингредиент $item в рецепте есть")
            break
        }
        else if (i == (ingredients.size - 1)) {
            println("Такого ингредиента в рецепте нет")
        }
    }
}
