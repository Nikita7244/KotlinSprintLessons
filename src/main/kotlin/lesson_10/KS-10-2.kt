package lesson_10

const val LOGIN_LENGTH = 4

fun validateLogin(login: String, password: String): Boolean {
    return login.length >= LOGIN_LENGTH && password.length >= LOGIN_LENGTH
}

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (!validateLogin(login = login, password = password)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать")
    }
}
