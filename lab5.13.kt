fun main(){
    for (n in 1..20){
        print("$n ^ 2 = ${Math.pow(n.toDouble(), 2.0)} \t")
        if(n % 5 == 0) print("\n")
    }
}