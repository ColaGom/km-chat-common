package io.colagom.chat.dto

import kotlinx.serialization.Serializable

@Serializable
class ChatMessage(
    val isMine: Boolean,
    val message: String
)