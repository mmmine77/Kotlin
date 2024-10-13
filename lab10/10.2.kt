fun pyramid(n: Int) {
    for (i in 1..n) {
        val space = " ".repeat(n - i)
        val hash = "#".repeat(2 * i - 1)
        println("$space$hash$space")
    }
}

fun main() {
    pyramid(19) // '#'
}