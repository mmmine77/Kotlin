fun main() {
    val numbers = intArrayOf(50, 20, 80, 10, 70, 30, 60, 40)

    println("Исходный массив:")
    printArray(numbers)

    numbers.sort()

    println("Отсортированный массив:")
    printArray(numbers)
}

fun printArray(arr: IntArray) {
    for (num in arr) {
        print("$num ")
    }
    println()
}
