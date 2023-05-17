package io.colagom.chat.model.request

import kotlinx.serialization.Serializable

@Serializable
data class SendChat(
    val type: ChatType,
    val message: String
)

enum class ChatType {
    JOIN,
    LEAVE,
    MESSAGE
}