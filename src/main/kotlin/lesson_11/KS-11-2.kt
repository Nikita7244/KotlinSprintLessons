package lesson_11

class UserData {
    var id: Int = 0
    var login: String = ""
    var password: String = ""
    var email: String = ""
    var bio: String = ""

    fun printInfo(){
        println("Содержимое объекта: id=${id}, login=${login}, password=${password}, email=${email}, bio=${bio}")
    }

    fun setBio() {
        println("Введите инфомрацию о пользователе")
        bio = readln()
    }

    fun changePassword() {
        println("Для смены пароля введите старый")
        val oldPassword = readln()

        if (oldPassword.equals(password)) {
            println("Введите новый пароль")
            password = readln()

            println("Пароль успешно изменён")
        } else println("Неверный пароль")
    }
}

fun main() {
    val user1 = UserData()
    user1.id = 1
    user1.login = "roma_2002"
    user1.email = "roma_2002@mail.ru"
    user1.password = "4321"

    user1.setBio()
    user1.changePassword()
    user1.printInfo()
}
