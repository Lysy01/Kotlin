package Klasy

class Prostokat(var a: Int, var b: Int) {


    fun obliczPole(): Int {
       return a * b
    }


}

fun main() {
    var prostokat: Prostokat = Prostokat( 10, 2)
    println(prostokat.obliczPole())
}