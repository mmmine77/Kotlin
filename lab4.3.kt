fun grade(c: Int): String {
    return when {
        c < 2 || c > 5 -> "Неправильное значение"
        c >= 5 -> "A"
        c >= 4 -> "B"
        c >= 3 -> "C"
        c >= 2 -> "D"
        else -> "F"
    }
}

fun main() {
    println("Введите оценку (число:")
    val score = readln().toInt()
    println("Оценка $score: ${grade(score)}")

}