fun main() {
    println("Введите первое число:")
    val a = readln().toIntOrNull() ?: return

    println("Введите второе число:")
    val b = readln().toIntOrNull() ?: return

    val nod = findGCD(a, b)
    println("Наибольший общий делитель чисел $a и $b: $nod")
}

fun findGCD(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}
