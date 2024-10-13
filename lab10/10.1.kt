fun main() {
    println(printNumber(9)) // []
}

fun printNumber(n: Int): List<Int> {
    return if (n > 0) {
        (n downTo 1).toList()
    } else {
        emptyList()
    }
}
