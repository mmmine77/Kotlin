fun main() {
    println("Введите число N:")
    val n = readln().toIntOrNull() ?: return

    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    println("Сумма чисел от 1 до $n равна $sum")
}
