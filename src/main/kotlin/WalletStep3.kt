fun main() {
    val startBalance = 5200
    var balance = startBalance
    println("Старт месяца: $balance руб.")

    val scholarship = 34_000
    balance += scholarship
    println("Стипендия: $balance руб.")

    val rentRoom = 15_000
    balance -= rentRoom
    println("Аренда: $balance руб.")

    val eat = 8_500
    balance -= eat
    println("Еда: $balance руб.")

    val transport = 2_100
    balance -= transport
    println("Транспорт: $balance руб.")

    val books = 1_590
    balance -= books
    println("Книги: $balance руб.")

    println("Конец месяца: $balance руб.")
    val spendAll = rentRoom + eat + transport + books
    val spendPart = spendAll * 100 / scholarship
    val savings = balance - startBalance
    val avgSpend = spendAll / 30
    val avgSpendFull = spendAll.toDouble() / 30

    println()

    println("""
        --- Аналитика месяца ---
        Потрачено всего: $spendAll руб.
        Доля трат от дохода: $spendPart%
        Отложено за месяц: $savings руб.
        Средние траты в день: $avgSpend руб.
        Точнее: $avgSpendFull руб.
    """.trimIndent())

    val target = 89_990
    val remains = target - balance
    val needTime = (remains + savings - 1) / savings

    println()

    println("""
        === Цель: ноутбук за $target руб. ===
        Уже есть: $balance руб.
        Осталось накопить: $remains руб.
        Откладывая по $savings руб. в месяц — цель через $needTime мес.
    """.trimIndent())
}
