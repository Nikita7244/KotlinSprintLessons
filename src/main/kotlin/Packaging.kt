fun main(){
    val mugs = 127
    val boxSize = 12
    val boxFull = mugs / boxSize
    val mugsRemains = mugs % boxSize
    val boxTotal = (mugs + (boxSize - 1)) / boxSize

    println("Полных коробок: $boxFull")
    println("Кружек без коробки: $mugsRemains")
    println("Коробок нужно всего: $boxTotal")
}
