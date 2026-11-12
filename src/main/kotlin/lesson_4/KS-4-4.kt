package lesson_4

fun main() {
    val day = 5
    val isHandsPress = (day % 2) == 1
    val isLegthBack = !isHandsPress

    println(
        """
        Упражнения для рук:    $isHandsPress
        Упражнения для ног:    $isLegthBack
        Упражнения для спины:  $isLegthBack
        Упражнения для пресса: $isHandsPress
    """.trimIndent()
    )
}
