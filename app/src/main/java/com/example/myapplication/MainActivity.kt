package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val error: HttpError = HttpError.NotFound
        when(error){
            HttpError.NotFound -> Unit
            is HttpError.Unauthorized -> Unit
        }

        val errorEnum: HttpErrorEnum = HttpErrorEnum.NotFound
        HttpErrorEnum.values().forEach(::println)
        when(errorEnum){
            HttpErrorEnum.NotFound -> TODO()
            HttpErrorEnum.Unauthorized -> TODO()
        }
    }
}