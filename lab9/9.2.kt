fun main() {

    println("Введите строку: ")
    val inputString = readln()
    val vowelCount = countVowels(inputString)
    println("Количество гласных: $vowelCount")
}

fun countVowelss(str: String): Int {
    val glas = "AaEeIiOoUuYy"
    var count = 0

    for (char in str) {
        if (glas.contains(char)) {
            count++
        }
    }

    return count
}