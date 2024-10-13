fun main() {

    println("Введите элементы массива (через пробел): ")
    val myArr = readln().split(" ").map { it.toInt() }.toIntArray()
    val copiedArray = copyArray(myArr)

    println("Копия массива: ${copiedArray.contentToString()}")
}

fun copyArray(arr: IntArray): IntArray {
    return arr.copyOf()
}