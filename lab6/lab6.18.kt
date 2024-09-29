import kotlin.random.Random

fun main() {
    val numbers = Array(25) { Random.nextInt(10, 80) }

    for (i in numbers.indices) {
        print(numbers[i])
        if ((i + 1) % 5 == 0) {
            println()
        } else {
            print("\t") 
        }
    }
}
