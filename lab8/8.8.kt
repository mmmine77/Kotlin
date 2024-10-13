fun main() {
    val min = 1
    val fps = 50
    val cad = cad(min, fps)
    println("$min минут(а) при $fps FPS = $cad кадров")
}

fun cad(min: Int, fps: Int): Long {
    val sec = min * 60
    return sec * fps.toLong()
}