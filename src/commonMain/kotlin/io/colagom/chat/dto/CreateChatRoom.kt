package io.colagom.chat.dto

import kotlinx.serialization.Serializable

@Serializable
data class CreateChatRoom(
    val name: String,
    val limit: Int
)