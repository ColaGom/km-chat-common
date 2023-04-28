package io.colagom.chat.dto

import kotlinx.serialization.Serializable

@Serializable
data class ChatUser(
    val id: Long,
    val name: String,
    val role: ChatUserRole
)

enum class ChatUserRole {
    OWNER,
    USER
}