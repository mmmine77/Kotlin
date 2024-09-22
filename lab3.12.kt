fun main(){
    print("Введите двузначное число: ")
    val a = readln().toInt()
    var ft = a / 10
    var sec = a % 10
    if (ft > sec) print("Первая цифра больше")
    else if (sec > ft) print("Вторая цифра больше")
    else if (sec == ft) print("Цифры равны")
}