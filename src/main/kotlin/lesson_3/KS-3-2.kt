package lesson_3

fun main() {
    val name: String = "Татьяна"
    var surname: String = "Андреева"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("$surname $name $patronymic, $age")
    surname = "Сидорова"
    age += 2

    println("$surname $name $patronymic, $age")

}
