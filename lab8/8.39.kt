fun main() {

    println("Введите элементы массива (через пробел): ")
    val myArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val reversedArr = reverseArray(myArray)
    println("Перевернутый массив: ${reversedArr.contentToString()}")
}

fun reverseArray(arr: IntArray): IntArray {
    return arr.reversedArray()
}