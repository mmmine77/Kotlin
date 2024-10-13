fun main() {
    val myArray = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80)

    print("Введите индекс элемента (от 0): ")
    val index = readln().toInt()

    val elem = findElement(myArray, index)
    if (elem != null) {
        println("Элемент: $elem")
    } else {
        println("Нет такого индекса")
    }
}

fun findElement(array: IntArray, index: Int): Int? {
    return if (index >= 0 && index < array.size) {
        array[index]
    } else {
        null
    }
}