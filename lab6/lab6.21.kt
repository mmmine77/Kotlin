import kotlin.random.Random
fun main() {
    val numbers = mutableListOf(0, 5, 1, 5, 12, 53, 65, 14, 6, 10, 32, 5)

    println("Элементы: ${numbers.joinToString(" ")}")

    print("Выберите любой элемент из списка (его индекс): ")
    val index = readln().toInt()

    numbers.removeAt(index)
    println("Обновленный список: ${numbers.joinToString(" ")}")
}
