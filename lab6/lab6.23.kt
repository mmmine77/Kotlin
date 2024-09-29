fun main() {
    val array1 = intArrayOf(99, 98, 97)
    val array2 = intArrayOf(89, 88, 87)
    val array3 = intArrayOf(79, 78, 77)

    val sarray = intArrayOf(*array1, *array2, *array3)
    println("Объединенный массив: ${sarray.joinToString(" ")}")
}