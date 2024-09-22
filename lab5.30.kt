fun main() {
    println("Введите целое число:")
    val number = readLine()!!.toInt()
    val dvoi = Integer.toBinaryString(number)
    println("Число в двоичном представлении: $number: $dvoi")
}