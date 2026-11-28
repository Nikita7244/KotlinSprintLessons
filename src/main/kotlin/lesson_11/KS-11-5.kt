package lesson_11

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
    val forumMembers: MutableList<ForumUser> = mutableListOf(),
    val forumMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(newUserName: String) = apply {
        this.forumMembers.add(
            ForumUser.Builder()
                .createUser(newUserName, forumMembers.size + 1)
                .build()
        )
    }

    fun createNewMessage(userId: Int, newMessage: String) = apply {
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
}

fun main() {
    val forum = Forum()

    forum.createNewUser("Pavel")
    forum.createNewUser("Leon")

    forum.createNewMessage(forum.forumMembers[0].userId, "Hello! My name is Pavel")
    forum.createNewMessage(forum.forumMembers[1].userId, "Hello! My name is Leon")

    forum.createNewMessage(forum.forumMembers[0].userId, "Where are you from Leon?")
    forum.createNewMessage(forum.forumMembers[1].userId, "I`m from London")

    forum.printThread()
}
