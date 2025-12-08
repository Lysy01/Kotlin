package Interfejsy

class Audi : Samochod, Spalinowy {
    var uruchomiony: Boolean = false

    override fun start() {
        uruchomiony = true
        //załączenie systemów
    }

    override fun stop() {
        uruchomiony = false
        // wyłączenie systemów
    }

    override fun zatankuj(ilosc: Double) {

    }
}