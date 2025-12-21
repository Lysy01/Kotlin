package ReviewObject

import Klasy.Osoba

fun main() {
    val anonimowy = object {

    }

    val anonimowyDziedziczy = object : Runnable {
        override fun run() {

        }

    }
}

object Singleton {

}

class Klasa {
    companion object {
        val STATIC = 123
    }
}