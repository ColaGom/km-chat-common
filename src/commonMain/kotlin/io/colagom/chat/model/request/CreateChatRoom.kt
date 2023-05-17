package io.colagom.chat.model.request

import kotlinx.serialization.Serializable

@Serializable
data class CreateChatRoom(
    val name: String,
    val limit: Int
)