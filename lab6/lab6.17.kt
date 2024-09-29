import kotlin.random.Random

fun main() {
    val array = Array(10) { Random.nextInt(1, 8) }

    println("Массив: ${array.joinToString(" ")}")

    var proz = array[0]
    for (i in 1 until array.size) {
        proz *= array[i]
    }
    println("Произведение всех элементов массива: $proz")
}
