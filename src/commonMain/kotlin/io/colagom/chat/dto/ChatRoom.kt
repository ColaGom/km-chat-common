package io.colagom.chat.dto

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

/**
 * ChatRoom data class is representing a chat room.
 *
 * @property id
 * @property name The name of the chat room.
 * @property current The number of users that are currently in the chat room.
 * @property limit The maximum number of users that can join the chat room.
 * @property createdAt The date when the chat room was created.
 */
@Serializable
data class ChatRoom(
    val id: Long,
    val name: String,
    val current: Int,
    val limit: Int,
    val createdAt: LocalDateTime
)