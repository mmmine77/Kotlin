fun main() {
    // Создаем первый массив
    println("Введите 5 чисел")
    val array1 = IntArray(5){
        readln().toInt()
    }

    println("Введите ещё 5 чисел")
    val array2 = IntArray(5){
        readln().toInt()
    }

    val nArray = array1 + array2

    // Выводим объединенный массив
    println("Объединенный массив: ${nArray.contentToString()}")
}
