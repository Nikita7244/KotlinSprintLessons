fun rollDice(): Int {
    return (1..6).random()
}

fun checkWinHuman(pointHumanity: Int, pointRobot: Int): Boolean {
    var isHumanWin: Boolean = false
    when {
        pointHumanity > pointRobot -> {
            println("Победило человечество")
            isHumanWin = true
        }
        pointHumanity < pointRobot -> println("Победила машина")
        else -> println("Победила дружба")
    }
    return isHumanWin
}

fun main() {
    var countWinHuman: Int = 0

    do {
        println("Для броска кубиков введите любой символ")
        readln()

        val humanPoint = rollDice()

        println("Вы выбросили $humanPoint")
        println("Ход компьютера")

        val robotPoint = rollDice()

        println("Компьютер выбросил $robotPoint")

        val isHumanWin = checkWinHuman(humanPoint, robotPoint)
        if (isHumanWin) countWinHuman++

        println("Хотите сыграть ещё раз?")
        val answer = readln()
    } while (answer.equals("Да", true))

    println("Выиграно партий: $countWinHuman")
}
