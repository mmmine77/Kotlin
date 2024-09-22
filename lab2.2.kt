fun main() {
    var n: Int
    do {
        print("Введите трехзначное число: ")
        n = readln().toInt()
    } while (n !in 100..999)
    println("\n\tВаше число: $n\n\tа)${n % 10 % 10}\n\tб)${n / 10}\n\tв)${n / 10 / 10 + n / 10 % 10 + n % 10 % 10}\n\tг)${(n / 10 / 10) * (n / 10 % 10) * (n % 10 % 10)}")
}