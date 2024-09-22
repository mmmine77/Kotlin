fun main() {
    print("Введите 2 числа через enter: \n")
    var n = readln().toInt()
    var a = readln().toInt()
    if (n % a == 0) print("Это кратные числа")
    else print("Остаток от деления: ${n % a}")
}