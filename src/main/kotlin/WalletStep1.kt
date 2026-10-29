fun main() {
    var balance = 5200
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
}
