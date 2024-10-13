import kotlin.random.Random

fun main() {
    val rand = Random.nextInt(1, 101)
    var guess: Int?

    println("Угадайте число от 1 до 100")

    do {
        println("Введите ваше число:")
        guess = readLine()!!.toInt()

        when {
            guess == null -> println("Введите целое число!!!")
            guess < rand -> println("Загаданное число больше! Попробуйте ещё.")
            guess > rand -> println("Загаданное число меньше! Попробуйте ещё.")
            else -> {
                Thread.sleep(1_500)
                println("\n\nПоздравляю! Вы угадали число!")
            }
        }
    } while (guess != rand)
}