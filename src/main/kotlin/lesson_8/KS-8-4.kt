package lesson_8

fun main() {
    val ingredients = arrayOf("помидор", "яйцо", "соль", "бекон")

    println(ingredients.joinToString(", "))

    var inputIngredient = ""

    do {
        println("Какой ингредиент хотите заменить?")
        inputIngredient = readln().lowercase()

        if (ingredients.indexOf(inputIngredient) < 0) println("Такого ингредиента нет. Введите заново")
    } while (!(ingredients.contains(inputIngredient)))

    val numToChange = ingredients.indexOf(inputIngredient)

    println("Какой ингредиент хотели бы добавить?")
    val newIngredient = readln().lowercase()

    ingredients[numToChange] = newIngredient

    println(ingredients.joinToString(", "))
}
