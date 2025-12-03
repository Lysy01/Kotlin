package Klasy

class Osoba (var imie: String? = null , var nazwisko: String? = null) {
        // properties sklada sie z pola i funkcji dostępowych

    var nazwa: String? = null
    get() {
        return "$imie $nazwisko - wypisano getterem"
    }
    private set
    var budzet: Double = 0.0
        set(wartosc) {
            field += wartosc
        }

    fun przedstawSie() {
        println("Jestem $imie $nazwisko ")
    }

}

fun main() {
    var osoba: Osoba = Osoba( "Jan" , "Kowalski") // tworzenie obiektu
    println(osoba.nazwa)
    // osoba.nazwa = "nic" // nie da sie bo jest private set essa
    osoba.budzet = 1000.0
    osoba.budzet = 2000.0
    println(osoba.budzet)
//    osoba.przedstawSie()

}

// konstruktory - podczas tworzenia obiektu moc podac początkowe wartosci (primary i secondary)