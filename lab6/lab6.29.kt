fun main() {
    println("Введите элементы массива через пробел:")
    val input = readln()
    val numbers = input.trim().split(" ").map { it.toInt() }.toIntArray()

    val mediana = findMedian(numbers)
    println("Медиана массива: $mediana")
}

fun findMedian(numbers: IntArray): Double {
    val sortNum = numbers.sortedArray()
    val size = sortNum.size

    return if (size % 2 == 0) {
        (sortNum[size / 2 - 1] + sortNum[size / 2]).toDouble() / 2
    } else {
        sortNum[size / 2].toDouble()
    }
}
