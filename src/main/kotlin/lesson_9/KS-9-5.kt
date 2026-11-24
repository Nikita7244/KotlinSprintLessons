package lesson_9

const val LIST_SIZE = 5

fun main() {
    println("Введите ${LIST_SIZE} названий ингредиентов")
    val inputList = mutableListOf<String>()

    for (i in 0 until LIST_SIZE) {
        println("Введите ингредиент №${i + 1}")
        inputList.add(readln().lowercase())
    }

    val resultList = inputList.distinct().sorted().toMutableList()
    resultList[0] = resultList[0].substring(0, 1).uppercase() + resultList[0].substring(1)

    println("Итоговый список: ${resultList.joinToString(", ")}")
}
