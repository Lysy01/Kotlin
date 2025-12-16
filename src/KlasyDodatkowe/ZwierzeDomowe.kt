package KlasyDodatkowe

abstract class ZwierzeDomowe(var nazwa: String) {

    abstract var odglos: String
    abstract fun wydajOdglos()

    fun zawolaj() {
        print("Chodz $nazwa")
    }


}