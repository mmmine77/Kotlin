fun main() {

    print("Первая строка: ")
    val firstStr = readln()

    print("Вторая: ")
    val secStr = readln()

    val resStr = concatStrings(firstStr, secStr)
    println("Объединенная строка: $resStr")
}

fun concatStrings(str1: String, str2: String): String {
    return str1 + str2
}