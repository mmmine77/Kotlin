fun main() {
    val x:Boolean = true
    val y:Boolean = true
    val z:Boolean = false
    print("X = $x\nY = $y\nZ = $z\n")
    print("a) ${!x and y}\n")
    print("б) ${x or !y}\n")
    print("в) ${x or y and z}\n")
}