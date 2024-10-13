fun main() {

    println("Введите строку: ")
    val mainString = readln()

    println("Введите подстроку для поиска: ")
    val substring = readln()

    val findString = findString1(mainString, substring)
    if (findString) {
        println("Подстрока содержится в строке '$mainString'")
    } else {
        println("Подстрока не содержится в строке '$mainString'")
    }
}

fun findString1(mainString: String, substring: String): Boolean {
    return mainString.contains(substring)
}