fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    val reversedNumbers = numbers.copyOf().apply { reverse() }

    println("Исходный массив: ${numbers.contentToString()}")
    println("Реверсированный массив: ${reversedNumbers.contentToString()}")
}
