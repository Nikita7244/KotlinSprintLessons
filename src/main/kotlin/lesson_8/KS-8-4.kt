package lesson_8

fun main() {
    val ingredients = arrayOf("помидор", "яйцо", "соль", "бекон")

    println(ingredients.joinToString(", "))

    var inputIngredient = ""

    do {
        println("Какой ингредиент хотите заменить?")
        inputIngredient = readln().lowercase()

        val isNotInArray = ingredients.indexOf(inputIngredient) < 0
        if (isNotInArray) println("Такого ингредиента нет. Введите заново")
    } while (isNotInArray)

    val numToChange = ingredients.indexOf(inputIngredient)

    println("Какой ингредиент хотели бы добавить?")
    val newIngredient = readln().lowercase()

    ingredients[numToChange] = newIngredient

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
}
