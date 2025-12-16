package String

fun main() {
    var tekst1 = "Tekst1"
    var tekst2 = "Tekst2"
    var tekstcaly = tekst1 + tekst2
    println(tekstcaly)
    // inny zapis laczenia ciagow znakow za pomoca templates ( znak dolara )
    var tekstSzablon = "$tekst1$tekst2"
    println(tekstSzablon)

    var liczba = 999
    println("Liczba: $liczba")

    // odwolanie do dlugosci tekstu ( musza byc nawiasy klamrowe zeby zadzialala metoda legth )

    println("Dlugosc tekstu: ${tekst1.length}")
    println("Dlugosc $tekst1: ${tekst1.length}")
}