fun main() {
    println("Введите натуральное число:")
    val number = readln().toInt()

    println("Число $number - ${if (number % 2 == 0) "четное" else "нечетное"}")

    if (number % 10 == 7) {
        println("оканчивается цифрой 7")
    } else {
        println("не оканчивается цифрой 7")
    }
}
