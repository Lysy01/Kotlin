package KlasyIDziedziczenie

open class Pracownik {
    var imie: String? = null
    var nazwisko: String? = null
    var obowiazki: String? = null
    var pensja: String? = null

    fun odmeldujSie() {
        println("Jestem $imie $nazwisko. Moje obowiazki to $obowiazki")
    }
}