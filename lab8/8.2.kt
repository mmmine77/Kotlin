import kotlin.random.Random

fun diff(arr: List<Int>):Int {
    return arr.max() - arr.min()
}

fun main(){
    val arr = List<Int>(10, {Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nРазность: ${arr.max()} и ${arr.min()}: ${diff(arr)}")
}