package Klasy


class Człowiek() {

    var wiek: Int = 0
        set(value) {
          field = when {
              value < 18 -> 18
              value in 18..30 -> value
              else -> value - 5
          }
        }
}

fun main() {
    var czlowiek = Człowiek()
    czlowiek.wiek = 31
    println(czlowiek.wiek)



}


