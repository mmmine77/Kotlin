fun main() {
    val rubToDollar = 0.012
    println("Введите сумму в рублях:")

    val rublInput = readLine()
    val rub = rublInput!!.toDouble()

    val dollars = rub * rubToDollar
    println("$rub рублей = $dollars долларов")
}
