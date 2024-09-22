import java.util.*

fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val blood = readLine()?.uppercase(Locale.getDefault())

    when (blood) {
        "A" -> println("Подходит для переливания: A, O.")
        "B" -> println("Подходит для переливания: B, O.")
        "AB" -> println("Подходит для переливания: A, B, AB, O.")
        "O" -> println("Подходит для переливания: O.")
        else -> println("Некорректная группа крови. Пожалуйста, введите A, B, AB или O.")
    }
}