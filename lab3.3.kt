fun main() {
    println("Введите два числа:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("$num1 - ${if (num1 % 2 == 0) "четное" else "нечетное"}")
    println("$num2 - ${if (num2 % 2 == 0) "четное" else "нечетное"}")
}