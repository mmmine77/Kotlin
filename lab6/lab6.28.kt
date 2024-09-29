fun main() {
    print("Введите элементы массива через пробел: ")
    val arr = readLine()!!.split(" ").map { it.toInt() }
    println(arr.joinToString(" "))
}