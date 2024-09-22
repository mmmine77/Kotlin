import kotlin.math.max
import kotlin.math.min

fun main(){
    print("Введите 2 числа через enter: \n")
    var a = readln().toFloat()
    var b = readln().toFloat()
    print("${min(a, b)} - меньшее число, ${max(a, b)} - большее число")
}