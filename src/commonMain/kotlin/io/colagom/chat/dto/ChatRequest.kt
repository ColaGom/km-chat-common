package io.colagom.chat.dto

import kotlinx.serialization.Serializable

@Serializable
data class ChatRequest(
    val type: ChatType,
    val message: String
)

enum class ChatType {
    JOIN,
    LEAVE,
    MESSAGE
}