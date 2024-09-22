fun main() {
    println("Введите число N:")
    val n = readln().toIntOrNull() ?: return

    var first = 0
    var second = 1
    println(first)
    println(second)

    for (i in 2 until n) {
        val next = first + second
        println(next)
        first = second
        second = next
    }
}
