package io.colagom.chat.usecase

import io.colagom.chat.model.ChatRoom

interface GetAllChatRoomUseCase : VoidUseCase<List<ChatRoom>>
