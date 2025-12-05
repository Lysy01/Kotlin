package KlasyIDziedziczenie

open class Pracownik(var imie:String, var nazwisko: String, var obowiazki: String, var pensja: Int) {

    fun odmeldujSie() {
        println("Jestem $imie $nazwisko. Moje obowiazki to $obowiazki")
    }
}