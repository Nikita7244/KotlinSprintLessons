package lesson_7

fun main() {

    var isPassTrue = false

    do {
        var pass = ""

        pass += ('1'..'9').shuffled()[0]
        val num =('0'..'9').shuffled().take(3)

        for (i in 0..2) {
            pass += num[i]
        }

        println("Ваш код авторизации: $pass")
        println("Введите код авторизации")
        val inputPass = readln()

        if (inputPass == pass) isPassTrue = true

    } while (!isPassTrue)

    println("Добро пожаловать!")
}
