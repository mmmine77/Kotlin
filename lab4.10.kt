fun main() {
    println("Выберите способ оплаты (1-3):")
    println("1. Наличные")
    println("2. Кредитная карта")
    println("3. PayPal")

    var paymentMethod = readln().toIntOrNull()

    var m = when (paymentMethod) {
        1 -> "Оплата наличными принята."
        2 -> "Оплата кредитной картой принята."
        3 -> "Оплата через PayPal принята."
        else -> {
            println("Такой способ оплаты не поддерживается.")
            return
        }
    }

    println(m)
}
