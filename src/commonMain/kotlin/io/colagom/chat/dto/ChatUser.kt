package io.colagom.chat.dto

import kotlinx.serialization.Serializable

@Serializable
data class ChatUser(
    val id: Long,
    val room: ChatRoom,
    val name: String
)