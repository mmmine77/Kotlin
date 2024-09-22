import kotlin.math.max

fun main(){
    print("Введите 3 числа через enter: \n")
    val a = readln().toInt()
    val c = readln().toInt()
    val b = readln().toInt()
    var mxx:Int = max(a, b)
    mxx = max(mxx, c)
    println("$mxx - максимальное число")

}