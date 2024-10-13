fun main() {

    print("Первая строка: ")
    val str1 = readln()

    print("Вторая: ")
    val str2 = readln()

    if (areAnagrams(str1, str2)) {
        println("$str1 и $str2 - анаграммы!")
    } else {
        println("$str1 и $str2 - не анаграммы :(")
    }
}