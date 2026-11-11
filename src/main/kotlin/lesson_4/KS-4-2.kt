package lesson_4

fun main() {
    val weightAverageMax = 100
    val weightAverageMin = 35
    val volumeAverageMax = 100

    val inputWeight1 = 20
    val inputVolume1 = 80
    val inputWeight2 = 50
    val inputVolume2 = 100

    println("Груз с весом $inputWeight1 кг и объемом $inputVolume1 л соответствует категории 'Average': ${(inputWeight1 > weightAverageMin) && (inputWeight1 <= weightAverageMax) && (inputVolume1 < volumeAverageMax)}")
    println("Груз с весом $inputWeight2 кг и объемом $inputVolume2 л соответствует категории 'Average': ${(inputWeight2 > weightAverageMin) && (inputWeight2 <= weightAverageMax) && (inputVolume2 < volumeAverageMax)}")
}
