fun main() {
    println("Введите число:")
    val n = readln().toInt()

    val factorial = cFactor(n)
    println("Факториал числа: $factorial")
}

fun cFactor(n: Int): Long {
    return if (n == 0 || n == 1) 1 else n * cFactor(n - 1)
}
