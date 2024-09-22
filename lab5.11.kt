fun main() {
    println("Введите первую строку (eng):")
    val str1 = readln()

    println("Введите вторую строку:")
    val str2 = readln()

    if (areAnagrams(str1, str2)) {
        println("Строки $str1 и $str2 являются анаграммами.")
    } else {
        println("Строки $str1 и $str2 не являются анаграммами.")
    }
}

fun areAnagrams(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false

    val charCount1 = IntArray(26) { 0 }
    val charCount2 = IntArray(26) { 0 }

    for (i in s1.indices) {
        charCount1[s1[i] - 'a']++
        charCount2[s2[i] - 'a']++
    }

    for (i in 0 until 26) {
        if (charCount1[i] != charCount2[i]) return false
    }

    return true
}
