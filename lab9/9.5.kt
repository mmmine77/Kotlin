fun main() {
    println("Введите натуральное число:")

    val nInput = readLine()
    val n = nInput!!.toInt()

    println("Простые числа до $n:")
    for (num in 2..n) {
        if (isPrimeee(num)) {
            println(num)
        }
    }
}

fun isPrimeee(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
