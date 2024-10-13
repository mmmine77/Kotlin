fun main() {
    println("Первое число:")
    val num1 = readln().toDouble()

    println("Второе число:")
    val num2 = readln().toDouble()

    val maxNum = findMax(num1, num2)
    println("Большее число: $maxNum")
}

fun findMax(a: Double, b: Double): Double {
    return if (a > b) a else b
}
