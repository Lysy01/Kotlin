package Nestedinnderclass.SealedClass

sealed class UserResult() {
    class Success(val user : User) : UserResult() {
        fun save () {
        }
    }
    class Failure(val messege: String) : UserResult() {
        fun showError() {
            println("Error with downloading data $messege")
        }
    }
}
class User {

}