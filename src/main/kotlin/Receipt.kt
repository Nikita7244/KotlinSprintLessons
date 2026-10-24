fun main() {
    // цены и количества товаров
    val mugPrice = 350
    val mugCount = 2

    val shirtPrice = 1200
    val shirtCount = 1

    val sticPrice = 450
    val sticCount = 3
    // стоимость каждой позиции и итог заказа
    val mugTotal = mugPrice * mugCount
    val shirtTotal = shirtPrice * shirtCount
    val sticTotal = sticPrice * sticCount
    val priceTotal = mugTotal + shirtTotal + sticTotal + sticPrice

    // println на каждую строку чека и на итог
    println("Кружка x$mugCount — $mugTotal руб.")
    println("Футболка х$shirtCount — $shirtTotal руб.")
    println("Стикерпак х$sticCount — $sticTotal руб.")
    println("Итого: $priceTotal руб.")
}