fun main() {
    print("Введите 3 числа через enter: \n")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    var sred:Int = 0
    if((a > b && a < c) || (a > c && a < b)) sred = a
    else if((b > a && b < c) || (b > c && b < a)) sred = b
    else if((c > b && c < a) || (c > a && c < b)) sred = c
    if((a == b) or (b == c) or (a == c)) print("ошибка! значения не должны повторяться")
    else print("$sred - cреднее число")
}