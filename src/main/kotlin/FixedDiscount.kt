fun main() {
    var price = 990
    val discountPercent = 20
    val discount = discountPercent * price / 100
    price = price - discount
    println("Со скидкой: $price руб.")
}
