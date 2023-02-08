package com.example.myapplication

//No other modules can extend this class
sealed class HttpError {

    //We can have subclasses that describe the HTTP Error.
    object Unauthorized: HttpError()
    object NotFound: HttpError()
}