fun main() {
    // Создаем массив
    println("Введите 5 чисел (через enter):")
    val myArray = IntArray(5) {
        readln().toInt()
    }

    if (isPalindrome(myArray)) {
        println("Массив является палиндромом")
    } else {
        println("Не палиндром")
    }
}

fun isPalindrome(array: IntArray): Boolean {
    for (i in 0 until array.size / 2) {
        if (array[i] != array[array.size - 1 - i]) {
            return false
        }
    }
    return true
}
