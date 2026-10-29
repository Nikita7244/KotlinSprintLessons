fun main(){
    var balance = 120
    println("Старт: $balance")

    balance += 1800 * 5 / 100
    println("После покупки на 1800: $balance")

    balance += 640 * 5 / 100
    println("После покупки на 640: $balance")

    balance -= 100
    println("После списани: $balance")

    balance += 2200 * 5 / 100
    println("После покупки на 2200: $balance")
    println("Итого на счёте: $balance бонуса")
}
