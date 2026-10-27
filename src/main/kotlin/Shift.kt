fun main() {
    val shiftMinutes = 437
    val orders = 23
    val payPerOrder = 85

    // расчёт и пять строк отчёта — здесь
    val hours = shiftMinutes / 60
    val minutes = shiftMinutes % 60
    val avgTime = shiftMinutes / orders
    val totalVal = orders * payPerOrder
    val avgVal = totalVal / orders

    println("Смена: $hours ч $minutes мин")
    println("Заказов: $orders")
    println("Заработок: $totalVal руб.")
    println("Средняя выручка с заказа: $avgVal руб.")
    println("В среднем минут на заказ: $avgTime")
}