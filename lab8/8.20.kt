import kotlin.random.Random
fun maxArr(arr: Array<Int>):Int {
    return arr.max()
}

fun main(){
    val arr = Array<Int>(20, { Random.nextInt(10, 80)})
    println("${arr.joinToString(", ")}\nМакс число: ${maxArr(arr)}")
}