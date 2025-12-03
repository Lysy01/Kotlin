package Funkcje

import kotlin.math.sqrt

// funkcje moga byc w pliku kotlinowym nie musza byc w klasie
// funkcje po to zeby podzielic kod na mniejsze kawalki

fun main() {
//    val wynikDodawania = dodawanie(a = 5 , B = 10)
//    println(wynikDodawania) // ten var jest Int bo przypisalem w dodawanie ze wynik ma byc Int
//
//    wypiszNaEkran(tekst = "Tekst z funkcji")
//    wypiszNaEkran()


    val predkosc = obliczPredkoscSpadkuSwobodnego(h = 2.0, g = 9.81) // podajac tu g nadpisuje deafulta czyli 10.0
    println("Predkosc: $predkosc")

    narysujTrojkat(8)
}

fun obliczPredkoscSpadkuSwobodnego(h: Double, g: Double = 10.0): Double {
    return sqrt( 2 * h * g)  // sqrt pierwiastek w kotlinie
}

fun narysujTrojkat(poziomy: Int = 5){
    for (i in 1..poziomy) { // dla kazdego pozioimu
        for (j in 1..i) { // dla kazdego poziomu konkretna liczbe poziomow i = 2 to 2 poziomy. po Kolei to bedzie tak jak i = np 3 to tak gdy i = 1 wypisze gwiazdke i nowa linia gdy i = 2 wypisze gwiazdke potem znowu gwiazdke bo zakres to od 1 do 2 czyli musi iterowac 2 razy
            print("*")
        }
        println()
    }
}



                    //          // typ jaki zwroci funkcja
//fun dodawanie(a:Int, B: Int): Int {
//    return a + B
//}

// void nic nie zwraca ale wykonuje czynnosc
// jesli ma zwrocic nic to musi byc typ Unit lub w ogole go nie pisac bo funkcja nic nie zwraca
//fun wypiszNaEkran(tekst: String = "nie podales tekstu!"){ // moge dodac wartosc domyslna jak user nie wprowadzi zadnej
//    println(tekst)
//}



// mozemy korzystac z named arguments, jawnie pokazac do jakiego argumentu ma byc przypisana dana wartosc
// moge zamienic kolejnosc a i b nie ma to znaczenia np  val wynikDodawania = dodawanie(  B = 10, a = 5)

