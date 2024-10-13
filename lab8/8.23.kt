fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val count = countCharacters(inputString)
    println("Количество символов: $count")
}

fun countCharacters(str: String): Int {
    return str.length
}