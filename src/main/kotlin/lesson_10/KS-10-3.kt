package lesson_10

fun genPassword(length: Int = 8): String {
    val digits = "0123456789"
    val symbols = "!\"#\$%&'()*+,-./ "
    var password: String = ""

    for (i in 0 until length) {
        if (i % 2 == 0) password += digits.random()
        else password += symbols.random()
    }

    return password
}

fun main() {
    println("Введите необходимую длину пароля")
    val passwordLength = readln().toInt()

    val password: String = genPassword(passwordLength)

    println("Результат генерации: $password")
}
