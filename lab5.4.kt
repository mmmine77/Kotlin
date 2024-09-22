fun main() {
    println("Введите число:")
    val n = readln().toIntOrNull() ?: return

    var factorial = 1L
    for (i in 1..n) {
        factorial *= i
    }

    println("Факториал числа $n равен $factorial")
}
