fun main() {

    print("Введите число: ")
    val num = readln().toInt()

    printTable(num)
}

fun printTable(number: Int) {
    println("Таблица умножения:")
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
    println()
}