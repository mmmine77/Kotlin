fun main() {
    val start = 5
    val step = 3
    val size = 10

    val array = Array(size) { index -> start + index * step }
    println("Арифметическая прогрессия: ${array.contentToString()}")
}
