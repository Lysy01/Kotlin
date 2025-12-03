package Funkcje

fun main() {
    print(czyOsobaPelnoletnia(17))

}

// czyli w zasadzie upraszczanie funkcji
// single expression function: po rownasie to co w klamerkach i return
fun dodawanie(a: Int, b: Int): Int = a + b


fun wypiszNaEkran(tekst: String = "Nie podales tekstu")  = println(tekst)

fun czyOsobaPelnoletnia(wiek: Int): Boolean =  if (wiek >= 18) true else false






