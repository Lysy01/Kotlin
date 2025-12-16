package KlasyIDziedziczenie

class Programista(
    imie: String,
    nazwisko: String,
    obowiazki: String,
    pensja: Int,
    var jezykProgramowania: String
) : Pracownik(imie, nazwisko, obowiazki, pensja) {

    override var lokalizacja: String = "zdalnie"
    override fun odmeldujSie() {
        super.odmeldujSie()
        println("Moj jezyk programowania to :$jezykProgramowania")
    }


}