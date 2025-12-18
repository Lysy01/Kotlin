package Nestedinnderclass.Object

fun main() {
    UstawieniaAplikacji.nazwa = "Nazwa Z Maina"
    println(UstawieniaAplikacji.nazwa)
    val ekran = ekran()
    ekran.ZmienUstawienia()

    println(UstawieniaAplikacji.nazwa )

}

class ekran {
    fun ZmienUstawienia() {
        UstawieniaAplikacji.nazwa = "Ekran zmienil ustawienia"
    }
}