import kotlin.random.Random

fun main() {
    println("Введите длину пароля:")

    val lenInput = readLine()
    val length = lenInput!!.toInt()

    val passwd = generPasswd(length)
    println("Ваш пароль: $passwd")
}

fun generPasswd(length: Int): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!$%^*()-_?"
    val password = StringBuilder()

    for (i in 0 until length) {
        val randomIndex = Random.nextInt(chars.length)
        password.append(chars[randomIndex])
    }

    return password.toString()
}
