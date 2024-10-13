fun del(n:Int): Boolean {
    return when{
        n % 100 == 0 -> true
        else -> false
    }
}
fun main(){
    println("Введите число (дел/не дел на 100):")
    val n = readln().toInt()
    println(del(n))
}