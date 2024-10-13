fun main() {

    print("Введите температуру (по Цельсию): ")
    val cTemper = readln().toDouble()

    val fTemper = celToF(cTemper)
    println("$cTemper°C = $fTemper°F")
}

fun celToF(celsius: Double): Double {
    return (celsius * 9.0 / 5.0) + 32.0
}