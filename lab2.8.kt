fun main() {
    val a:Boolean = true
    val b:Boolean = false
    val c:Boolean = false
    print("A = $a\nB = $b\nC = $c\n")
    print("a) ${!a and b}\n")
    print("б) ${a or !b}\n")
    print("в) ${a and b or c}\n")
}