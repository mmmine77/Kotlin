fun main() {
    println("Введите длины сторон треугольника:")
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    // Проверяем условие существования треугольника
    if (a + b <= c || b + c <= a || a + c <= b) {
        println("Треугольник не получится")
        return
    }

    val triangleType = when {
        a == b && b == c -> "Равносторонний"
        a == b || b == c || a == c -> "Равнобедренный"
        a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b -> "Прямоугольный"
        else -> "Разносторонний"
    }

    println("Тип треугольника: $triangleType")
}
