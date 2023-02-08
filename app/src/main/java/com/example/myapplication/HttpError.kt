package com.example.myapplication

//No other modules can extend this class
sealed class HttpError(val code: Int){
    object Unauthorized: HttpError(401)
    object NotFound: HttpError(404)
}