import kotlin.random.Random

fun difference(arr1: List<Int>, arr2: List<Int>):List<Int> {
    return arr1 + arr2
}

fun main(){
    val arr1 = List<Int>(10, { Random.nextInt(-50, 50)})
    val arr2 = List<Int>(10, { Random.nextInt(-50, 50)})
    println("Элементы массивов:\n${arr1.joinToString(" ")} | ${arr2.joinToString(" ")}\nОбЪединение: \n${difference(arr1, arr2).joinToString(" ")}")
}