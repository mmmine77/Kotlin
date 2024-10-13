fun main() {
    println("Выражение:")
    val expr = readln()
    println("Результат: ${equation(expr)}")
}

fun equation(expr: String): Int {
    val parts = expr.split("(?=[+\\-*/])|(?<=[+\\-*/])".toRegex())
    var res = parts[0].toInt()

    for (i in 1 until parts.size step 2) {
        when (parts[i]) {
            "+" -> res += parts[i + 1].toInt()
            "-" -> res -= parts[i + 1].toInt()
            "*" -> res *= parts[i + 1].toInt()
            "/" -> res /= parts[i + 1].toInt()
        }
    }

    return res
}
