package KlasyIDziedziczenie

fun main() {
    var pracownik: Pracownik = Pracownik("Jan", "Kowalski","Obsluga klienta", 5000)
    var programista: Programista = Programista(
        "Adam", "Nowak", "Programowanie aplikacji", 12000, "Kotlin"
    )

    pracownik.odmeldujSie()
    programista.odmeldujSie()

}