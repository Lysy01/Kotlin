package String

fun main() {

    // ============== STRING==================
    var tekst: String = "String"
    var tekstDlugi = "DlugiString"
    var tekstWspolny = tekst + ". " + tekstDlugi
    var liczba = 100
    println( "Wyswietl: " + tekstWspolny + liczba) // moge dopisac ciagi tekstow do wyswietlania lub jakies inne zmienne
    var dlugosc = tekst.length
    println(dlugosc) // odwolujemy sie do dlugosc a nie dlugosc.length bo nie zadziala

    // tekst.substring()    // substring , mozna pobrac czesc ze stringa np koncowy czy początkowy
    // tekst.trim // usuwa z przodu i z tylu biale znaki
    // tekst.startsWith // podajemy ciag znakow i sprawdzamy czy string zaczyna sie na ten ciag znakow i zwroci true lub false

    println(tekst[2]) // odwolanie sie do pojedynczych znakow w stringu 2 to indeks


    // przejscie po calym stringu

    for (znak in tekst) {
        println(znak)
    }
}