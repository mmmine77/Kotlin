fun main() {
    val x:Boolean = false
    val y:Boolean = false
    val z:Boolean = true
    print("X = $x\nY = $y\nZ = $z\n\n")
    print("a) ${(x or y and !z)}\n")
    print("г) ${x and !y or z}\n")
    print("б) ${!x and !y}\n")
    print("д) ${(x and(!y or z))}\n")
    print("в) ${!(x and z) or y}\n")
    print("е) ${(x or (!(y or z)))}\n")
}