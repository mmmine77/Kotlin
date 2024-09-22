fun main(){
    println("Введите число:")
    var n = readlnOrNull()?.toInt()
    for (a in 1..n!!) println("$a\t".repeat(a))
}