fun main() {
    println(fineFine(18))
}

fun fineFine(n: Int): List<Any> {
    return (1..n).map {
        when {
            it % 2 == 0 -> "Whyyyy"
            it % 3 == 0 -> "Whoooo"
            it % 5 == 0 -> "Whaaaat"
            else -> it
        }
    }
}
