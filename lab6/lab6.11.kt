import kotlin.random.Random

fun main() {
    val arr1 = IntArray(10) { Random.nextInt(1, 11) }
    val arr2 = IntArray(10) { Random.nextInt(1, 11) }

    println("Массив 1: ${arr1.contentToString()}")
    println("Массив 2: ${arr2.contentToString()}")

    val per = arr1.intersect(arr2.toSet()).toIntArray()

    println("Пересечение: ${per.contentToString()}")
}
