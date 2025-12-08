package KlasyDodatkowe

class Pies(nazwa: String): ZwierzeDomowe(nazwa) {

    override var odglos: String = "hau hau"
    override fun wydajOdglos() {
        println("$nazwa szczeknął: $odglos")
    }

}