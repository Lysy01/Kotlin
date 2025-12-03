package Klasy

class Pogoda(var miasto: String, var temperatura: Double){
    var wiatr: Double? = null
    constructor(miasto: String, temperatura: Double, wiatr: Double) : this(miasto, temperatura){
        this.wiatr = wiatr
    }
}

fun main() {
    var pogodaWarszawa = Pogoda("Warszawa", 22.0)
    var pogodaTorun = Pogoda("Toruń", 20.4, 5.0)
    var ojciec = cwel("Irenek ")
    ojciec.ojciec
}