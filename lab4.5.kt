fun ch(num: Int): String {
    return when {
        num < 0 -> "отрицательное"
        num > 0 -> "положительное"
        else -> "это ноль. не имеет знака"
    }
}

fun main() {
    println("Введите число:")
    val number = readln().toInt()
    println("Число $number - ${ch(number)}")
}