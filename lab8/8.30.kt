fun main() {

    print("Введите N: ")
    val n = readln().toInt()
    val sum = sumN(n)
    println("Сумма чисел от 1 до N: $sum")
}

fun sumN(n: Int): Int {
    return (n * (n + 1)) / 2
}