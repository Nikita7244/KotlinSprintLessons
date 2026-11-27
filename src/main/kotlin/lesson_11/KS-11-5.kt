package lesson_11

class ForumUser private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId = -1
        private var userName =  ""

        fun createNewUser(newUserName: String) = apply { this.userName = newUserName }
    }
}