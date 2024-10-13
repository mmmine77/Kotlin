import kotlin.random.Random

fun findElem(arr:Array<Int>, n:Int):Boolean{
    return if(n in arr) true else false
}
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(10, 80)})
    print("${arr.joinToString(", ")}\nn = ")
    var n = readln().toInt()
    println("Массив содержит элемент? $n: ${findElem(arr, n)}")
}