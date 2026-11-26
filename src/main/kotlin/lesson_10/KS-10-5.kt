package lesson_10

const val LOGIN = "Dimon"
const val PASSWORD = "45Gh"
const val TOKEN_LENGHT = 32

fun checkUser(login: String, password: String): Boolean? {
    if (login == LOGIN && password == PASSWORD) return true
    else return null
}

fun generateToken(): String {
    val charList = arrayOf('a'..'z', '0'..'9', 'A'..'Z')
    var token = ""

    for (i in 0 until TOKEN_LENGHT) {
        token += charList[i % charList.size].random()
    }

    return token.toList().shuffled().joinToString(separator = "")
}

fun getBasket(token: String): String {
    val basket = arrayOf("масло", "сало", "молоко")
    return basket.joinToString(", ")
}

fun main() {
    val userLogin = "Dimon"
    val userPassword = "45Gh"

    if (checkUser(userLogin, userPassword) == true) {
        val token = generateToken()
        val listItem = getBasket(token)
        println("Список корзины: $listItem")
    } else {
        println("Неверный логин или пароль")
    }
}
