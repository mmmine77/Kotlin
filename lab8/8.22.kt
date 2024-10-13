fun main() {

    print("Введите строку: ")
    val inputString = readln()

    if (isPalindrom(inputString)) {
        println("Палиндром!")
    } else {
        println("Не палиндром :(")
    }
}

fun isPalindrom(str: String): Boolean {
    val Str = str.lowercase().replace(" ", "")
    val reversedStr = Str.reversed()
    return Str == reversedStr
}