package Funkcje

import javax.swing.text.StyledEditorKit

fun main() {
    println(pobierzNastepnaLiczbeParzysta(20))
    println(czyPrzestepny(2028))

    wyswietlLiczby(2, 5)
}

fun pobierzNastepnaLiczbeParzysta(liczba: Int): Int =
    if ((liczba + 1)  % 2 == 0) {
         liczba + 1
    } else {
         liczba + 2
    }



// 2

fun czyPrzestepny(rok: Int): Boolean = (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)

// 3
fun wyswietlLiczby(start: Int = 1, koniec: Int) {
    for (i in start..koniec) {
        print("$i ")
    }
}
