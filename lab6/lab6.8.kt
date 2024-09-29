import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(10, 80)})
    println("Ваш массив: ${arr.joinToString(" ")}\nВведите ваш элемент:")
    val n = readln().toInt()
    arr.forEachIndexed{index, element ->
        if (element == n) println("Это элемент под индексом $index")
    }

}