package Nestedinnderclass

fun main() {


    val Kasa = object {
        var Pieniadze : Int = 0
        fun DodajKase(){
            var dodanakasa = Pieniadze + 2
            println(dodanakasa)
        }
    }
    Kasa.Pieniadze = 5000
    Kasa.DodajKase()

    val mojListener = object : Listener {
        override fun onClick() {
            println("kliklem")
        }
    }
    mojListener.onClick()
}

interface Listener {
    fun onClick()
}