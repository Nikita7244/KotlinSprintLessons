fun main(){
    val revenue = 14_250
    val orders = 8
    val average = revenue.toDouble() / orders
    val avgMud = revenue / orders
    println("Выручка: $revenue руб.")
    println("Заказов: $orders")
    println("Средний чек: $average руб.")
    println("Средний чек (грубо): $avgMud руб.")
}
