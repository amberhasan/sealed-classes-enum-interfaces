package com.example.myapplication


sealed interface HttpError{
    data class Unauthorized(val reason: String): HttpError
    object NotFound: HttpError
}

enum class HttpErrorEnum(val code: Int) {
    Unauthorized(401),
    NotFound(404);
}