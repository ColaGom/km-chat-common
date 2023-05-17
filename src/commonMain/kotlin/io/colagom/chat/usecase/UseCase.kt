package io.colagom.chat.usecase

interface UseCase<INPUT, OUTPUT> {
    suspend fun execute(input: INPUT): OUTPUT
}

typealias VoidUseCase<OUTPUT> = UseCase<Unit, OUTPUT>

suspend fun <T> VoidUseCase<T>.execute(): T = execute(Unit)