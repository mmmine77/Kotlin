fun main() {
    print("Введите 3 числа через enter: \n")
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    if ((a <= b + c) and (b <= a + c) and (c <= b + a)) print("Можно построить треугольник")
    else println("Нельзя построить треугольник")
}