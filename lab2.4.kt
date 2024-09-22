import kotlin.math.pow

fun main() {
    print("Введите число: ")
    var a = readln().toDouble()
    print("Степень, в которую хотите возвести число: ")
    var n = readln().toInt()
    print("\n $a ^ $n = ${a.pow(n)}")
}