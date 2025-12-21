package lateinit

class Notatka {

    // można korzystać w ciele klasy
    // z var
    // bez własnych getterów i setterów
    // nie może być zmienna nullem
    // nie może być typem podstawywym (Int, Double itd.)
    lateinit var tekst: String
    private set
    fun zapiszNotatke(informacja: String) {
        tekst = informacja
    }
}

fun main() {
    val notatka = Notatka()
    notatka.zapiszNotatke("Oto moja notatka")
    println(notatka.tekst)
}