package ExtensionedFunctions

fun main() {
    1 + 2
    1.plus(2)
    1 dodaj 2


    val punkt1 = Punkt(1, 2)
    val punkt2 = Punkt(-2, 6)
    val punkt3 = punkt1 + punkt2
    println("${punkt3.x} ${punkt3.y}")
    println(punkt1 > punkt2)

    val punkt4 = punkt1 dodaj punkt2

}

class Punkt(var x : Int, var y : Int) {
    operator fun plus(inny: Punkt): Punkt {
        return Punkt(this.x + inny.x, this.y + inny.y)
    }

    operator fun compareTo(inny: Punkt): Int {
        if (this.x != inny.x) {
            return this.x - inny.x
        } else {
            return this.y - inny.y
        }
    }

    infix fun dodaj(inny: Punkt): Punkt {
        return Punkt(this.x + inny.x, this.y + inny.y)
    }
}

infix fun Int.dodaj(liczba: Int) : Int = this + liczba