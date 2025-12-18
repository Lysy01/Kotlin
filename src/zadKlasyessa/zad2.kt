package zadKlasyessa


data class Komputer (var procesor: Double, var pamiec: Int, var dysk: Int) {

}

val komputer1 = Komputer(3.2, 8, 256)
val komputer2 = Komputer(4.0, 16, 512)
val komputer3 = Komputer(3.2, 8, 256)

fun main() {
    println(komputer1)
    println(komputer2)
    println(komputer3)

    println("Does komputer1 equals komputer2: " + komputer1.equals(komputer2))
    println("Does komputer1 equals komputer3: " + komputer1.equals(komputer3))
}