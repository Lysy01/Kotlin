package String

fun main() {
    //  wypisanie ciagu w wielu liniach a nie jak string tylko to co w cudzysłowiach
    // rawstring dwa razy " + enter
    var tekstSurowy = """
        Pierwsza linijka
        Druga linijka
        Trzecia linijka
    """.trimIndent() // usuwa wszelkie biale znaki, niepotrzebne linie itd

//    var tekstSurowy = """Pierwsza linijka
//Druga linijka
//Trzecia linijka
//    """ tak by musialo byc napisane bez trima zeby bylo tak samo jak u góry
    var tekstWielolinijkowy = "Pierwsza linijka\nDruga linijka\n Trzecia linijka"
    println(tekstWielolinijkowy)
    println()
    println(tekstSurowy)
}