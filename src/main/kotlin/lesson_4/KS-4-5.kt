package lesson_4

fun main() {
    println("Есть ли у корабля повреждения?")
    val isInjured: Boolean = readln().toBoolean()
    println("Сколько экипажа на борту?")
    val crew: Int = readln().toInt()
    println("Сколько провизии на борту?")
    val provision: Int = readln().toInt()
    println("Погода благоприятна для плавания?")
    val isWeather: Boolean = readln().toBoolean()

    val conditionOne: Boolean = (isInjured == false) && (crew >= 55 && crew <= 70) && (provision > 50)
    val conditionTwo: Boolean = (isInjured == true) && (crew == 70) && (isWeather == true) && (provision >= 50)

    val canShipDepart: Boolean = conditionOne || conditionTwo

    println("Корабль может отплыть: $canShipDepart")
}
