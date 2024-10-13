fun main() {
    println("Введите число:")
    val num = readln().toInt()

    val isPrime = isPrimee(num)
    println("Число простое: $isPrime")
}

fun isPrimee(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
