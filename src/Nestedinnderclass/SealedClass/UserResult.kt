package Nestedinnderclass.SealedClass

fun main() {
    fun handeUserResponse(userResult: UserResult) = when(userResult){
            is UserResult.Success -> userResult.save()
            is UserResult.Failure -> userResult.showError()
    }
}