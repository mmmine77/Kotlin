fun main() {
    println("Введите начальное число:")
    val start = readln().toIntOrNull() ?: return

    println("Введите шаг:")
    val step = readln().toIntOrNull() ?: return

    generateSequence(start, step)
}

fun generateSequence(start: Int, step: Int) {
    var current = start
    println("Числовая последовательность:")

    while (true) {
        println(current)
        current += step
    }
}
