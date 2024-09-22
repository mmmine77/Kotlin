import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(10, 26)

    println("Я загадал число от 10 до 25. Попробуйте его угадать.")

    while (true) {
        println("Введите ваше число:")
        val guess = readln().toIntOrNull() ?: continue

        when {
            guess < secretNumber -> println("Ваше число меньше загаданного. Попробуйте еще раз.")
            guess > secretNumber -> println("Ваше число больше загаданного. Попробуйте еще раз.")
            else -> {
                println("Поздравляю, вы угадали!")
                break
            }
        }
    }
}
