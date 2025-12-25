package ExtensionedFunctions

fun main() {
    var sciana = Sciana()
    sciana.maluj()
    sciana.zniszcz()

    var text = "Ala ma kota"
//    println(removeFirstLetter(text))
    println(text.removeFirstLetter())
}

fun Sciana.zniszcz() {
    // booom
}

//fun removeFirstLetter (text: String): String {
//    return text.substring(1)
//}

fun String.removeFirstLetter(): String {
    return this.substring(1)
}