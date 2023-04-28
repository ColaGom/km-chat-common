package io.colagom.chat.repository

import io.colagom.chat.dto.ChatUser

interface ChatUserRepository {
    fun getAllByRoomId(roomId: Long): List<ChatUser>
    fun save(chatUser: ChatUser)
}