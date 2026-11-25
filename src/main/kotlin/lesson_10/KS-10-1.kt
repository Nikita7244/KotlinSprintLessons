package lesson_10

fun rollDice(): Int {
    return (1..6).random()
}

fun main() {
    println("Для броска кубиков введите любой символ")
    readln()

    val humanPoint = rollDice()

    println("Вы выбросили $humanPoint")
    println("Ход компьютера")

    val robotPoint = rollDice()

    println("Компьютер выбросил $robotPoint")

    when {
        humanPoint > robotPoint -> println("Победило человечество")
        humanPoint < robotPoint -> println("Победила машина")
        else -> println("Победила дружба")
    }
}
