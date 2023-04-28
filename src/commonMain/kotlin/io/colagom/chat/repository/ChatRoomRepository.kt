package io.colagom.chat.repository

import io.colagom.chat.dto.ChatRoom

interface ChatRoomRepository {
    fun getAll(): List<ChatRoom>
    fun save(chatRoom: ChatRoom)
}