fun main() {
    val revenueBox1 = 1_254_350
    val revenueBox2 = 987_425
    val revenueBox3 = 758_225
    val orders = 40
    val revenueTotal = revenueBox1 + revenueBox2 + revenueBox3
    val revenueAvg = revenueTotal / orders

    val partBox1 = revenueBox1 * 100 / revenueTotal
    val partBox2 = revenueBox2 * 100 / revenueTotal
    val partBox3 = revenueBox3 * 100 / revenueTotal

    val outStr = """
        === Отчёт за смену ===
        Касса 1: ${revenueBox1 / 100} руб. ${revenueBox1 % 100} коп. ($partBox1%)
        Касса 2: ${revenueBox2 / 100} руб. ${revenueBox2 % 100} коп. ($partBox2%)
        Касса 3: ${revenueBox3 / 100} руб. ${revenueBox3 % 100} коп. ($partBox3%)
        Итого: ${revenueTotal / 100} руб. ${revenueTotal % 100} коп.
        Заказов: $orders
        Средний чек: ${revenueAvg / 100} руб. ${revenueAvg % 100} коп.
    """.trimIndent()

    println(outStr)
}
