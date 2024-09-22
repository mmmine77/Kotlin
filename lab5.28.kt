fun main() {
    println("Введите количество чисел:")
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    println("Введите $n чисел (через пробел):")
    val input = readLine()!!
    numbers.addAll(input.split(" ").map { it.toInt() })
    numbers.sort()

    // Выводим отсортированные числа
    println("Числа по возрастанию:")
    println(numbers.joinToString(", "))
}