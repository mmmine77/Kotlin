fun main() {
    println("Введите код ошибки (100, 200, 300):")
    val errorCode = readln().toIntOrNull()

    val errorMessage = when (errorCode) {
        100 -> "Ошибка сети"
        200 -> "Ошибка сервера"
        300 -> "Ошибка доступа"
        else -> {
            println("Нет такого кода")
            return
        }
    }

    println(" -- $errorMessage")
}
