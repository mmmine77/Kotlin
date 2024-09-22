fun main(){
    print("Введите год: \n")
    var yr = readln().toInt()
    if((yr % 4 == 0 && yr % 100 != 0)) print("$yr - Високосный год, 366 дней")
    else print("$yr - Невисокосный год, 365 дней")
}