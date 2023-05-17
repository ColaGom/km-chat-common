package io.colagom.chat.model

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

/**
 * ChatRoom data class is representing a chat room.
 *
 * @property id
 * @property name The name of the chat room.
 * @property limit The maximum number of users that can join the chat room.
 * @property createdAt The date when the chat room was created.
 */
@Serializable
data class ChatRoom(
    val id: Long,
    val name: String,
    val limit: Int,
    val users: MutableList<ChatUser>,
    val createdAt: LocalDateTime,
) {
    fun addUser(user: ChatUser) {
        users.add(user)
    }
}