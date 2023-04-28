package io.colagom.chat.repository

import io.colagom.chat.dto.Chat

interface ChatRepository {
    fun getAllByRoomId(roomId: Long): List<Chat>
    fun save(chat: Chat)
}