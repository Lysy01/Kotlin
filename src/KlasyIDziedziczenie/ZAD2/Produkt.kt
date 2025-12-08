package KlasyIDziedziczenie.ZAD2

open class Produkt(open var vat: Double) {
    open fun wyswietlInformacje() {
        print("Podatek VAT wynosi $vat%")
    }
}

class Zywnosc(vat: Double = 5.0) : Produkt(vat) {

}

class PaliwoSilnikowe(vat: Double = 23.0) : Produkt(vat) {

}

class Wegiel(vat: Double = 23.0) : Produkt(vat) {

    var limit: Int? = null

    constructor(vat: Double = 23.0, limit: Int) : this(vat) {

        this.limit = limit
    }

    override fun wyswietlInformacje() {
        super.wyswietlInformacje()
        if (limit != null) {
            println("Limit zakupu to $limit (ton)")
        }
    }
}

fun main() {
    var zywnosc = Zywnosc(0.0)
    var paliwo = PaliwoSilnikowe(8.0)
    var wegiellimit = Wegiel(limit = 2)

    zywnosc.wyswietlInformacje()
    paliwo.wyswietlInformacje()
    wegiellimit.wyswietlInformacje()

}