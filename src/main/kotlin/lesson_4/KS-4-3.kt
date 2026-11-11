package lesson_4

const val NEED_AIR_HUMIDITY = 20
const val WINTER = "зима"

fun main () {
    val isWeatherSun = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${isWeatherSun && isTentOpen && (airHumidity == NEED_AIR_HUMIDITY) && (season.lowercase() != WINTER)}"
    )
}
