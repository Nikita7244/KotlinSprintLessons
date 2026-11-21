package lesson_7

const val PASS_LEN = 6

fun main() {
    val uniqSymbolCount = PASS_LEN / 2
    val letter = ('a'..'z').shuffled().take(uniqSymbolCount)
    val num = ('0'..'9').shuffled().take(uniqSymbolCount)
    var password = ""

    for (i in 0 until uniqSymbolCount) {
        password += letter[i]
        password += num[i]
    }

    println("Сгенерированный пароль: $password")
}
