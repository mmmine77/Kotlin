import kotlin.random.Random

fun sort(arr: Array<Int>):Array<Int> {
    return arr.sortedArray()
}
fun main(){
    val arr = Array<Int>(20, { Random.nextInt(10, 80)})
    println("Массив: ${arr.joinToString(" ")}")
    println("Sorted: ${sort(arr).joinToString(" ")}")
}