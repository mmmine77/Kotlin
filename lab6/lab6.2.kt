fun main() {
    // Создаем массив чисел
    val numbers = intArrayOf(10, 20, 30, 40, 50)

    // Выводим элементы массива
    println("Элементы массива:")
    for (num in numbers) {
        println(num)
    }

    // Вычисляем сумму элементов массива
    val sum = numbers.sum()

    // Выводим результат
    println("Сумма элементов массива: $sum")
}
