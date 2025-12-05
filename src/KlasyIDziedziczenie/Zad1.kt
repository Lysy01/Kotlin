package KlasyIDziedziczenie

open class Obuwie(val rozmiar:Int, var cena: Double) {

    fun wyswietlDane() {
        println("$rozmiar $cena")
    }
}

class Klapki(rozmiar: Int, cena: Double ) : Obuwie(rozmiar, cena) {

}
class Sztyblety(rozmiar: Int,cena: Double) : Obuwie(rozmiar, cena) {

}

fun main() {
    val klapki = Klapki(44, 24.00)
    val sztyblety = Sztyblety(rozmiar = 4, cena = 50.0)
    klapki.wyswietlDane()
    print("Sztyblety to :")
    sztyblety.wyswietlDane()
}
