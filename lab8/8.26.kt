import kotlin.random.Random

fun lastElem(arr:Array<Int>):Int{
    return arr.last()
}
fun main(){
    val arr = Array<Int>(10, {Random.nextInt(10, 80)})
    println("Массив: ${arr.joinToString(" ")}")
    println("Последний элемент: ${lastElem(arr)}")
}