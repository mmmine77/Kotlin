fun repetition(txt: String, n: Int): String {
    return if (n == 1) {
        txt
    } else {
        txt + repetition(txt, n - 1)
    }
}

fun main() {
    println("Строка для повтора: ")
    val inputStr = readln()
    println("Количество повторений")
    val repeatedCount = readln().toInt()
    val result = repetition(inputStr, repeatedCount)
    println("$result")
}


