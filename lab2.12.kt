fun main() {
    val a:Boolean = true
    val b:Boolean = false
    val c:Boolean = false
    print("A = $a\nB = $b\nC = $c\n")
    print("a) ${a or !(a and b) or c}\n")
    print("б) ${!a or a and (b or c)}\n")
    print("в) ${(a or b and !c) and c}\n")
}
