fun main() {

    print("Введите строку: ")
    val inputStr = readln()

    val uppercaseStr = convertToUppercase(inputStr)
    println("Верхний регистр: $uppercaseStr")
}

fun convertToUppercase(str: String): String {
    return str.uppercase()
}