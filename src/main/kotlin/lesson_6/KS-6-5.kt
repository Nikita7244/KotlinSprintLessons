package lesson_6

fun main() {
    var attempt = 3

    println("Для входа необходимо ввести капчу. У Вас есть $attempt попытки.")

    while (attempt > 0) {
        val summandOne = (1..9).random()
        val summandTwo = (1..9).random()
        attempt--

        println("Сколько будет $summandOne + $summandTwo?")
        val result = readln().toInt()

        if (result == (summandOne + summandTwo)) {
            println("Добро пожаловать!")
            break
        } else if (attempt == 0){
            println("Доступ запрещен")
        } else {
            println("Ошибка. Осталось попыток $attempt. Попробуй ещё раз")
        }
    }
}
