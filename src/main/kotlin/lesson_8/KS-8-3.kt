package lesson_8

fun main() {
    val ingredients = arrayOf("помидор", "яйцо", "соль", "бекон")

    println("Какой ингредиент вы хотите найти?")
    val inputIngredient = readln()

    if (ingredients.contains(inputIngredient.lowercase())) {
        println("Ингредиент ${inputIngredient.lowercase()} в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
