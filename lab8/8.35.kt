fun main() {

    print("Введите количество натуральных чисел: ")
    val n = readln().toInt()

    val sum = sumOfFirstNumb(n)
    println("Сумма первых $n натуральных чисел = $sum")
}

fun sumOfFirstNumb(n: Int): Int {
    return n * (n + 1) / 2
}