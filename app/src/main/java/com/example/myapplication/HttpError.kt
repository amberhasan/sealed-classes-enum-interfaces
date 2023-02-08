package com.example.myapplication

// Instances. More customization!!!!
//Sealed classes are just like enum classes but more customization
//Always ask yourself if we need individual behavior, for example the "reason" vs not.
sealed class HttpError(val code: Int){
    data class Unauthorized(val reason: String): HttpError(401) //like, Unauthorized can have different instances w diff reasons.
    object NotFound: HttpError(404)

    fun doSomething() {

    }
}

//Constants, cannot have individual instances in enum - can do codes.
enum class HttpErrorEnum(val code: Int) {
    Unauthorized(401),
    NotFound(404);

    fun doSomething() {

    }
}