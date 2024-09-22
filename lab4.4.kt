import java.time.LocalTime

fun getTimeOfDay(hour: Int, min:Int): String {
    return when {
        (hour in 4..11 && min in 0..59) -> "Утро"
        (hour in 11..16 && min in 0..59) -> "День"
        (hour in 17..23 && min in 0..59) -> "Вечер"
        (hour in 0..3 && min in 0..59) -> "Ночь"
        else -> "Неправильное значение"
    }
}

fun main() {
    println("Введите час:")
    var hour = readln().toInt()
    if (hour == 24) println("Ночь")
    else{
        println("Минут:")
        var min = readln().toInt()
        println("Текущее время суток: ${getTimeOfDay(hour, min)}")
    }
}