package lesson_5

const val USER = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("""
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля
        "Heart of Gold". Вздыхает... Что ж, введи, пожалуйста, свое имя пользователя,
         чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости...
         но вы, наверное, об этом не заботитесь. Вздыхает ещё глубже... 
         Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent())

    var login = readln()
    var isCorrect = false
    var isNewUser = false

    when {
        login == USER -> {
            println("Введите пароль")
            val enteredPassword = readln()
            if (enteredPassword == PASSWORD) isCorrect = true
        }
        else -> {
            println("Давайте Вас зарегестрируем")
            login = readln()
            println("Придумайте пароль")
            val newPassword = readln()

            isNewUser = true
        }
    }

    if (isCorrect || isNewUser) println("""
        Вздыхает... Ваши данные проверены, и о, чудо, они верны... 
        Пользователь "${if (isCorrect) login else login}", вам разрешено входить на борт корабля "Heart of Gold". 
        Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, 
        в конце концов... Меланхолический вздох. Надеюсь, вам понравится
        пребывание здесь больше, чем мне.
    """.trimIndent())
}
