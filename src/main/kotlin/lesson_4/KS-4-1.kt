package lesson_4

const val ALL_TABLES: Int = 13

fun main () {
    val bookToday: Int = 13
    val bookTomorrow: Int = 9
    val canBookToday:Boolean = bookToday < ALL_TABLES
    val canBookTomorrow: Boolean = bookTomorrow < ALL_TABLES

    println("Доступность столиков на сегодня: $canBookToday")
    println("Доступность столиков на завтра: $canBookTomorrow")
}
