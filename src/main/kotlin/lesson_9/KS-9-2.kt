package lesson_9

fun main() {
    val ingredients = mutableListOf<String>("помидор", "яйцо", "соль")

    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString()}")

    println("Желаете добавить еще?")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString()}")
    }
}
