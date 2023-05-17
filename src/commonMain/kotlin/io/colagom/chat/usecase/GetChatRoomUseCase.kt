package io.colagom.chat.usecase

import io.colagom.chat.dto.ChatRoom

interface GetChatRoomUseCase : UseCase<Long, ChatRoom> {
    override suspend fun execute(input: Long): ChatRoom
}