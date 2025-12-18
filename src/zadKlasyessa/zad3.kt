package zadKlasyessa

object Matematyka {

    fun dodawanie (a: Double, b: Double) : Double {
        return a + b
    }
    fun odejmowanie (a: Double, b: Double): Double{
        return a - b
    }
    fun mnozenie (a: Double, b: Double) : Double{
        return a * b
    }
    fun dzielenie (a: Double, b: Double): Double{
        if (b != 0.0 ) {
            return a / b
        } else
            println("nie da sie dzielic przez 0!!!")
        return Double.MIN_VALUE
    }
}

fun main() {
    println(Matematyka.dodawanie(1.0, 2.0))
    println(Matematyka.odejmowanie(1.0,2.0))
    println(Matematyka.dzielenie(1.0,2.0))
    println(Matematyka.dzielenie(1.0,0.0))
    println(Matematyka.mnozenie(1.0,2.0))
}