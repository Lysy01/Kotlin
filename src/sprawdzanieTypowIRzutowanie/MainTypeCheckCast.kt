package sprawdzanieTypowIRzutowanie

fun main() {
    var owoc : Owoc
    owoc = Jabłko()
    wez(owoc)

    var zmienna: Any
    zmienna = "Dowolny tekst"
    SprawdzZmienna(zmienna)

    rzutowanie("Tekst")
}

fun rzutowanie(any: Any?) {
    var liczba: Int? = any as? Int
    println("rzutowanie $liczba ")
}

fun wez(owoc: Owoc) {
    if (owoc is Jabłko) {
        owoc.zjedz()
    } else {
        println("Nie lubie innych owocow")
    }
}

fun SprawdzZmienna(zmienna: Any) {
//    if (zmienna is Owoc) {
//        zmienna.zjedz()
//    } else if (zmienna is String) {
//        println(zmienna.uppercase())
//    } else {
//        println("Nie obsluguje takiej zmiennej")
//    }
    when (zmienna) {
        is Owoc -> zmienna.zjedz()
        is String -> println(zmienna.uppercase())
        else -> println("Nie obsluguje takiej zmiennej")
    }


}
