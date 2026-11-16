package lesson_6

fun main() {
    println("Придумайте логин и введите его")
    val login = readln()

    println("Придумайте пароль и введите его")
    val password = readln()

    do {
        println("Введите логин")
        val inputLogin = readln()
        println("Введите пароль")
        val inputPassword = readln()

        if ((inputLogin != login) || (inputPassword != password)) println("Неверный логин или пароль. Попробуйте ещё раз")
    } while ((inputLogin != login) || (inputPassword != password))

    println("Авторизация прошла успешно")
}
