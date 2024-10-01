import kotlin.random.Random

fun ravn(a: Int, b: Int) = a == b

fun main() {
    val num1 = Random.nextInt(0, 6)
    val num2 = Random.nextInt(0, 6)
    println("$num1 = $num2: ${ravn(num1, num2)}")
}
