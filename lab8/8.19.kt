import kotlin.random.Random

fun sumArr(arr: Array<Int>):Int {
    return arr.sum()
}

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(10, 80)})
    println("${arr.joinToString(", ")}\nСумма элементов: ${sumArr(arr)}")
}