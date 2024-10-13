fun main() {
    println("Введите число:")
    val num = readln().toInt()

    val isChet = isChet(num)
    println("Чётное: $isChet")
}

fun isChet(n: Int): Boolean {
    return n % 2 == 0
}
