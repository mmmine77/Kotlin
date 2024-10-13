import kotlin.random.Random
fun main() {
    print("Введите строку: ")
    val inputStr = readln()

    val reversedStr = reverseStr(inputStr)
    println("Строка в обратном порядке: $reversedStr")
}

fun reverseStr(str: String): String {
    return str.reversed()
}