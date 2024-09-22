fun main() {
    println("Введите два числа:")
    var a = readln().toInt()
    var b = readln().toInt()

    if (b % a == 0) {
        println("Число $a является делителем числа $b")
    } else {
        println("Число $a не является делителем числа $b")
    }
}
