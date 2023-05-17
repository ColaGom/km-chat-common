package io.colagom.chat.usecase

import io.colagom.chat.model.ChatRoom
import io.colagom.chat.model.request.CreateChatRoom

interface CreateChatRoomUseCase : UseCase<CreateChatRoom, ChatRoom>