import kotlin.random.Random

fun main() {
    val arr = Array(25) { Random.nextInt(10, 80) }

    println("Массив: ${arr.joinToString(" ")}")

    print("\nЭлемент для поиска в массиве: ")
    val number = readln().toInt()
    println(isNumberInArray(number, arr))
}

fun isNumberInArray(number: Int, arr: Array<Int>): Boolean {
    return number in arr
}
