package io.colagom.chat.usecase

import io.colagom.chat.dto.ChatRoom

interface GetAllChatRoomUseCase : VoidUseCase<List<ChatRoom>> {
    override suspend fun execute(input: Unit): List<ChatRoom>
}
