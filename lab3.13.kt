fun main() {
    println("Введите четырехзначное число:")
    val number = readln().toInt()

    println("Введите число а:")
    val a = readln().toInt()

    val d1 = number / 1000
    val d2 = (number / 100) % 10
    val d3 = (number / 10) % 10
    val d4 = number % 10

    val sumFirstTwo = d1 + d2
    val sumLastTwo = d3 + d4
    val sumAll = d1 + d2 + d3 + d4
    val prodAll = d1 * d2 * d3 * d4

    println("a) Суммы двух первых и двух последних цифр ${if (sumFirstTwo == sumLastTwo) "равны" else "не равны"}")
    println("b) Сумма цифр ${if (sumAll % 3 == 0) "кратна трем" else "не кратна трем"}")
    println("c) Произведение цифр ${if (prodAll % 4 == 0) "кратно четырем" else "не кратно четырем"}")
    println("d) Произведение цифр ${if (a % prodAll == 0) "кратно числу $a" else "не кратно числу $a"}")
}
