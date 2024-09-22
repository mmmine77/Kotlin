fun main() {
    print("Введите 2 числа через enter: \n")
    var m = readln().toInt()
    var n = readln().toInt()
    if (m % n == 0) print("${m / n} - Частное")
    else print("Не делится нацело")
}
