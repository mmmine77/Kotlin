fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    println("Числа в массиве, делящиеся на 3:")
    for (n in numbers) {
        if (n % 3 == 0) {
            println(n)
        }
    }
}
