package lesson_11

class userData {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
}

fun main() {
    val user1 = userData()
    user1.id = 1
    user1.login = "Dima"
    user1.password = "1234"
    user1.email = "dima@mail.ru"

    val user2 = userData()
    user2.id = 2
    user2.login = "Roma"
    user2.password = "4321"
    user2.email = "roma_2002@ya.ru"

    println("Содержимое 1 экземпляра: id=${user1.id}, login=${user1.login}, password=${user1.password}, email=${user1.email}")
    println("Содержимое 2 экземпляра: id=${user2.id}, login=${user2.login}, password=${user2.password}, email=${user2.email}")
}
