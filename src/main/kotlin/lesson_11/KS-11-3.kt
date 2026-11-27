package lesson_11

class User(
    val profilePicture: String,
    val nickname: String,
    var status: String,
) {
    val availableStaus = arrayOf<String>("разговаривает", "микрофон выключен", "пользователь заглушен")

    fun updateStatus(newStatus: String) {
        if (newStatus in availableStaus) {
            status = newStatus
        } else println("Данный статус нельзя присвоить")
    }
}

class Room(
    var cover: String? = null,
    var name: String? = null,
    val participant: MutableList<User>,
) {
    fun addParticipant(newUser: User) {
        participant.add(newUser)
    }

    fun changeStatus(newStatus: String, name: String) {
        for (item in participant) {
            if (name.equals(item.nickname)) {
                item.updateStatus(newStatus)
                break
            }
        }
    }
}

fun main() {
    val user1 = User(
        "dog",
        "Aboba",
        "разговаривает",
    )

    val user2 = User(
        "cat",
        "URew",
        "пользователь заглушен",
    )

    val room = Room(
        "Black triangle",
        "Music",
        mutableListOf(user1, user2),
    )
}
