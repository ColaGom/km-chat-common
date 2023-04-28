package io.colagom.chat.repository

import io.colagom.chat.dto.ChatRoom
import io.colagom.chat.dto.ChatUser

interface ChatUserRepository {
    fun getAllByRoomId(roomId: Long): List<ChatUser>
    fun getById(id: Long): ChatUser?
    fun save(room: ChatRoom, userName: String): ChatUser
    fun delete(user: ChatUser)
}