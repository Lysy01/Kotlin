package Nestedinnderclass

fun main() {
    val osoba1 = Osoba("Adam", "Nowak")
    val osoba2 = Osoba("Adam", "Nowak")

    println(osoba1)
    println(osoba1.equals(osoba2))
}

data class Osoba(val imie: String, val nazwisko: String) {
    // data class umozliwia przeslanianie roznych funkcji i dzialanie na wartosciach obiektow a nie samych
    // obiektach
}