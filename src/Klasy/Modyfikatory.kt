package Klasy

class Modyfikatory private constructor(var login: String? = null, private var password: String? = null) {


    public var polePublic: String? = null
    protected var poleProtected: String? = null
    private var polePrivate: String? = null
    var poleBezModyfikatora: String? = null // public
    internal var poleInternal: String? = null
}

fun main() {
//    var user = Modyfikatory("cwel123","321lewc")
//    user.password
}