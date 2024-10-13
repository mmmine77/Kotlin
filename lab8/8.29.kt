import kotlin.random.Random

fun findMinMax(arr: Array<Int>): Pair<Int, Int> {
    return arr.fold(Pair(arr[0], arr[0])) { acc, num ->
        Pair(minOf(acc.first, num), maxOf(acc.second, num))
    }
}
fun main() {
    val arr = Array(10) { Random.nextInt(10, 80) }

    println("Массив: ${arr.joinToString(" ")}")
    val (min, max) = findMinMax(arr)

    println("Мин: $min")
    println("Макс: $max")
}
