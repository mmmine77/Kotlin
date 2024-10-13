fun main() {
    println("Введите 2 числа через enter:")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val result1 = sumLess(n1, n2)
    println("$result1")

}

fun sumLess(n1: Int, n2: Int): Boolean {
    return (n1 + n2) < 100
}