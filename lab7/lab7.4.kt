import kotlin.random.Random
fun minNumber(numbers: List<Int>): Int {
    return if (numbers.isEmpty()) {0}
    else {
        numbers.minOrNull() ?: 0
    }
}

fun main() {
    val numbers = List(5){Random.nextInt(0, 15)}
    println("$numbers")
    val minNumber = minNumber(numbers)
    println("Самое маленькое число: $minNumber")
}
