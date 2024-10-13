fun main() {
    println("Первое число:")
    val num1 = readln().toDouble()

    println("Второе число:")
    val num2 = readln().toDouble()

    val sum = funcSum(num1, num2)
    println("Сумма: $sum")
}

fun funcSum(a: Double, b: Double): Double {
    return a + b
}
