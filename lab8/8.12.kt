fun main() {
    println("Enter a number:")
    val n = readln().toInt()
    println(google(n))
}

fun google(number: Int): String {
    val builder = StringBuilder("G")
    repeat(number) {
        builder.append("o")
    }
    builder.append("gle")
    return builder.toString()
}
