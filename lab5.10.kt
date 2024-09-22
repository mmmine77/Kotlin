fun main() {
    println("Введите число:")
    val number = readln().toIntOrNull() ?: return

    val sum = getSumOfDigits(number)
    println("Сумма цифр числа $number: $sum")
}

fun getSumOfDigits(n: Int): Int {
    var sum = 0
    var num = n
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}
