package io.colagom.chat.dto

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
    val userId: Long,
    val message: String,
    val sentAt: LocalDateTime
)