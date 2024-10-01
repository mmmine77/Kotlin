fun main() {
    println("Консольный калькулятор")
    while (true) {
        print("Введите первое число: ")
        val n1 = readln().toDouble()

        print("Второе число: ")
        val n2 = readln().toDouble()

        print("Выберите оператор (+ - * / %): ")
        val oper = readln()
        val result = when (oper) {
            "+" -> n1 + n2
            "%" -> n1/100 * n2
            "-" -> n1 - n2
            "*" -> n1 * n2
            "/" -> if (n2 != 0.0) n1 / n2 else {
                println("Ошибка: деление на ноль")
                continue
            }
            else -> {
                println("Ошибка: недопустимый оператор")
                continue
            }
        }
        println("Результат: $result")
        print("Продолжить? (y/n) ")
        val continueInput = readln().lowercase()
        if (continueInput != "y") break
    }
}