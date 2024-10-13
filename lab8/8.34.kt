fun main() {

    print("Введите строку: ")
    val inputStr = readln()

    val stringSpace = removeSpaces(inputStr)
    println("Строка без пробелов: $stringSpace")
}

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}