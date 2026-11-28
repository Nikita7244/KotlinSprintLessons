package lesson_11

const val USER_P = "Pavel"
const val USER_L = "Leon"

class ForumUser private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        private var userId = -1
        private var userName = ""

        fun createUser(newUserName: String, newId: Int): Builder {
            this.userName = newUserName
            this.userId = newId
            return this
        }

        fun build(): ForumUser {
            return ForumUser(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId = 0
        private var message = ""

        fun createMessage(userId: Int, newMessage: String): Builder {
            this.authorId = userId
            this.message = newMessage
            return this
        }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

class Forum(
    private val forumMembers: MutableList<ForumUser> = mutableListOf(),
    private val forumMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(newUserName: String): ForumUser {
        return ForumUser.Builder()
            .createUser(newUserName, forumMembers.size + 1)
            .build()
    }

    fun createNewMessage(userId: Int?, newMessage: String) = apply {
        for (item in forumMembers) {
            if (item.userId == userId) {
                this.forumMessages.add(
                    ForumMessage.Builder()
                        .createMessage(userId, newMessage)
                        .build()
                )
            }
        }
    }

    fun printThread() {
        for (message in forumMessages) {
            for (item in forumMembers) {
                if (message.authorId == item.userId) {
                    println("${item.userName}: ${message.message}")
                    break
                }
            }
        }
    }

    fun getUserId(userName: String): Int? {
        for (item in forumMembers) {
            if (item.userName == userName) {
                return item.userId
            }
        }
        return null
    }

    fun addUserToForum(user: ForumUser) {
        forumMembers.add(user)
    }
}

fun main() {
    val forum = Forum()

    forum.addUserToForum(forum.createNewUser(USER_P))
    forum.addUserToForum(forum.createNewUser(USER_L))

    forum.createNewMessage(forum.getUserId(USER_P), "Hello! My name is Pavel")
    forum.createNewMessage(forum.getUserId(USER_L), "Hello! My name is Leon")

    forum.createNewMessage(forum.getUserId(USER_P), "Where are you from Leon?")
    forum.createNewMessage(forum.getUserId(USER_L), "I`m from London")

    forum.printThread()
}
