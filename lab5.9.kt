fun main() {
    println("Введите строку:")
    val input = readln()

    var reversedString = ""
    for (i in input.length - 1 downTo 0) {
        reversedString += input[i]
    }

    println("Строка в обратном порядке: $reversedString")
}
