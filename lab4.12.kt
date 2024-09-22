fun main() {
    println("Введите страну: (сша/россия/япония/германия/франция/италия)")
    val country = readln().toLowerCase()

    val nationality = when (country) {
        "сша" -> "американцы"
        "россия" -> "русские"
        "япония" -> "японцы"
        "германия" -> "немцы"
        "франция" -> "французы"
        "италия" -> "итальянцы"
        else -> {
            println("Неверный ввод")
            return
        }
    }

    println("национальность - $nationality.")
}
