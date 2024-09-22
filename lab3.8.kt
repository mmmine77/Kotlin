import kotlin.math.max
import kotlin.math.min

fun main(){
    print("Введите 2 (расстояние в км и футах) через enter: \n")
    var km = readln().toDouble()
    var f = readln().toDouble()
    if(km < (f * 0.000305)) println("$km км - меньшее расстояние")
    else if((f * 0.000305) < km) println("$f футов - меньшее расстояние")
}