fun main() {
    val numbers = intArrayOf(10, 20, 30, 40, 10, 50, 20, 60)
    for (n in numbers) {
        print("$n ")
    }
    println()
    println("Уникальные элементы: ${numbers.distinct().toString()}")
}
