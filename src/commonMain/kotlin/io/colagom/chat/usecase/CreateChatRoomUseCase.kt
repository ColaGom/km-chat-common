package io.colagom.chat.usecase

import io.colagom.chat.dto.ChatRoom
import io.colagom.chat.dto.request.CreateChatRoom

interface CreateChatRoomUseCase : UseCase<CreateChatRoom, ChatRoom> {
    override suspend fun execute(input: CreateChatRoom): ChatRoom
}