fun main() {
    val nbs = IntArray(10) {(10..80).random()}
    // Выводим исходный массив
    println("Исходный массив: ${nbs.contentToString()}")

    // Разделяем массив на четные и нечетные числа
    val evenNumbers = nbs.filter { it % 2 == 0 }.toIntArray()
    val oddNumbers = nbs.filter { it % 2 != 0 }.toIntArray()

    // Выводим полученные массивы
    println("Четные числа: ${evenNumbers.contentToString()}")
    println("Нечетные: ${oddNumbers.contentToString()}")
}
