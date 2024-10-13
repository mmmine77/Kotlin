fun function1(prob: Double, prize: Double, pay: Double): Boolean {
    return when{
        prize * prob > pay -> true
        else -> false
    }
}

fun main(){
    print("prob = ")
    val prob = readln().toDouble()
    print("prize = ")
    val prize = readln().toDouble()
    print("pay = ")
    val pay = readln().toDouble()
    println(function1(prob, prize, pay))
}