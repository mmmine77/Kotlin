fun main() {

    print("Введите строку: ")
    val inputStr = readln()
    val reversedStr = reverseCase(inputStr)
    println("Новая строка: $reversedStr")
}

fun reverseCase(str: String): String {
    val strr = StringBuilder()

    for (char in str) {
        strr.append(if (char.isUpperCase()) char.lowercase() else char.uppercase())
    }
    return strr.toString()
}