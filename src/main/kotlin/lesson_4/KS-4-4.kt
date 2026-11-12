package lesson_4

fun main() {
    val isHandsPress = true
    val isLegthBack = !isHandsPress

    println("""
        Упражнения для рук:    $isHandsPress
        Упражнения для ног:    $isLegthBack
        Упражнения для спины:  $isLegthBack
        Упражнения для пресса: $isHandsPress
    """.trimIndent())
}
