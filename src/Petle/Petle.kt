package Petle

fun main() {
//    var tablica = intArrayOf(5,55,100, -3,-99)
//    for (element in tablica) {
//        println(element)
//    }
//    println("")
//    println("")
//
//    for (i in 0 until tablica.size){
//        println(tablica[i])
//    }
    var ilepazystych = 0
    val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)

    for (liczba in tab) {
        if (liczba % 2 == 0 ) {
            ilepazystych++
        }
    }
    println(ilepazystych)
}
