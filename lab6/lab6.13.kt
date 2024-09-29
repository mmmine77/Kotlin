import kotlin.random.Random

fun main() {
    // Создаем массив из 20 случайных чисел от 1 до 100
    val randn = IntArray(20) { Random.nextInt(1, 101) }

    // Выводим массив на экран
    println("Массив случайных чисеk:")
    println(randn.joinToString(" "))
}
