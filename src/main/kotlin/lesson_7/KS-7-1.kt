package lesson_7

const val PASS_LEN = 6

fun main() {
    val uniqSymbolCount = PASS_LEN / 2
    val letter = listOf<String>(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    ).shuffled().take(uniqSymbolCount)
    val num = listOf<String>("0", "1", "2", "3", "4", "5", "6", "7", "8", "9").shuffled().take(uniqSymbolCount)
    var password = ""

    for (i in 0 until uniqSymbolCount) {
        password += letter[i]
        password += num[i]
    }

    println("Сгенерированный пароль: $password")
}
