fun main() {
    val myList = listOf(1, 2, 3, 4, 5)
    val result = sumOfList(myList)
    println("$myList")
    println("Сумма элементов: $result")
}

fun sumOfList(list: List<Int>): Int {
    return list.sum()
}
