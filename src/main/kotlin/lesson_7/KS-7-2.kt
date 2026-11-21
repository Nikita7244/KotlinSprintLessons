package lesson_7
import kotlin.random.Random

fun main() {

    var isPassTrue = false

    do {
        var pass = ""

        pass += ('1'..'9').shuffled()[0]
        val num =('0'..'9').toList()

        while (pass.length != 4) {
            pass += num[Random.nextInt(num.size)]
        }

        println("Ваш код авторизации: $pass")
        println("Введите код авторизации")
        val inputPass = readln()

        if (inputPass == pass) isPassTrue = true

    } while (!isPassTrue)

    println("Добро пожаловать!")
}
