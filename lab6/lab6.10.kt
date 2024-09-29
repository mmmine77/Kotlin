import kotlin.random.Random

fun main() {
    val numbers = IntArray(10) { Random.nextInt(10, 80) }

    var chet = 0

    for (n in numbers) {
        if (n % 2 == 0) {
            chet += n
        }
    }
    println("Массив: ${numbers.contentToString()}")
    println("Сумма четных чисел: $chet")
}
