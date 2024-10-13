fun main() {
    val strings = arrayOf("Яблоко", "Ананас", "Банан", "Груша")

    println(strings.joinToString(" "))
    val sortedStrings = sortStr(strings)

    println("Отсортированный массив:")
    println(sortedStrings.joinToString(" "))
}
fun sortStr(array: Array<String>): Array<String> {
    return array.sortedArray()
}
