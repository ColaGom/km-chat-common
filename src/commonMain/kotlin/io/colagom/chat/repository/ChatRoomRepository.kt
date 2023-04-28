package io.colagom.chat.repository

import io.colagom.chat.dto.ChatRoom

interface ChatRoomRepository {
    fun getById(id: Long): ChatRoom?
    fun getAll(): List<ChatRoom>
    fun save(room: ChatRoom)
}