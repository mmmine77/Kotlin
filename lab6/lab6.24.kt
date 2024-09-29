fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val numRows = matrix.size
    val numCols = matrix[0].size

    val transposedMatrix = Array(numCols) { Array(numRows) { 0 } }

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun main() {
    val originalMatrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val transposedMatrix = transposeMatrix(originalMatrix)
    println("Исходная матрица:")
    originalMatrix.forEach { println(it.contentToString()) }

    println("\nТранспонированная матрица:")
    transposedMatrix.forEach { println(it.contentToString()) }
}
