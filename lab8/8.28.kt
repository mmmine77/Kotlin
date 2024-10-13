fun main() {

    print("Введите число N: ")
    val n = readln().toInt()
    val array = createArr(n)
    println("Массив от 1 до N: ${array.contentToString()}")
}

fun createArr(n: Int): Array<Int> {
    return Array(n) { i -> i + 1 }
}