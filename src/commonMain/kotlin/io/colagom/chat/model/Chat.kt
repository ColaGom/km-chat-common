package io.colagom.chat.model

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

/**
 * Chat data class
 *
 * @property id
 * @property sentAt The date when the chat send.
 */
@Serializable
data class Chat(
    val id: Long,
    val room: ChatRoom,
    val user: ChatUser,
    val message: String,
    val sentAt: LocalDateTime
)