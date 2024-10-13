fun main() {

    println("Введите строку: ")
    val inputStr = readln()
    val strLength = getStrLength(inputStr)
    println("Длина строки: $strLength символов")
}

fun getStrLength(str: String): Int {
    return str.length
}