package lesson_10

const val LOGIN = "Dimon"
const val PASSWORD = "45Gh"
const val TOKEN_LENGHT = 32

fun generateToken(): String {
    val charList = arrayOf('a'..'z', '0'..'9', 'A'..'Z')
    var token = ""

    for (i in 0 until TOKEN_LENGHT) {
        token += charList[i % charList.size].random()
    }

    return token.toList().shuffled().joinToString(separator = "")
}

fun checkUser(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) return generateToken()
    else return null
}

fun getBasket(token: String): Array<String> {
    val basket = arrayOf("масло", "сало", "молоко")
    return basket
}

fun main() {
    val userLogin = "Dimon"
    val userPassword = "45Gh"

    val token = checkUser(userLogin, userPassword)
    if (token != null) {
        val listItem = getBasket(token)
        println("Список корзины: ${listItem.joinToString(", ")}")
    } else {
        println("Неверный логин или пароль")
    }
}
