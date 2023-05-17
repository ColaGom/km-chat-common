package io.colagom.chat.model

import kotlinx.serialization.Serializable

@Serializable
data class ChatUser(
    val id: Long,
    val roomId: Long,
    val name: String
)