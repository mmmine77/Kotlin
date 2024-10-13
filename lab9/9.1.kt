import kotlin.random.Random

fun main() {
    val rand = List(10) { Random.nextInt(1, 101) }
    println(rand.joinToString(", "))
}
