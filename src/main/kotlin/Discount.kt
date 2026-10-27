fun main() {
    val price = 1200
    val discount = 15
    val priceDiscount = (price * discount) / 100
    val discountSize = price - priceDiscount

    println("Цена: $price")
    println("Со скидкой: $priceDiscount")
    println("Экономия: $discountSize")
}