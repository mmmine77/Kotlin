fun main() {
    Thread.sleep(1000)
    while (true) {
        println("Введите первую цифру:")
        val firstNumberInput = readLine()
        println("Введите вторую цифру:")
        val secondNumberInput = readLine()
        val firstNumber = firstNumberInput?.toDoubleOrNull()
        val secondNumber = secondNumberInput?.toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            val sum = firstNumber + secondNumber
            val product = firstNumber * secondNumber

            println("Сумма: $sum")
            println("Произведение: $product")
        } else {
            println("Недопустимое значение.")
        }
    }
}