fun main() {
    val numbers = IntArray(10) { (0..100).random() }

    println("Элементы массива:")
    for (num in numbers) {
        print("$num ")
    }
    println()

    val max = numbers.maxOrNull() ?: 0
    val min = numbers.minOrNull() ?: 0

    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}
