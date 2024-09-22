fun main() {
    println("Введите число:")
    val number = readln().toIntOrNull() ?: return

    if (number <= 1) {
        println("$number не является простым числом.")
        return
    }

    var isPrime = true
    for (i in 2 until number) {
        if (number % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$number является простым числом.")
    } else {
        println("$number не является простым числом.")
    }
}
