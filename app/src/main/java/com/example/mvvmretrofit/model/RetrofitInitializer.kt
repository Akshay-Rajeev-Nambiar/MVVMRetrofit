package com.example.mvvmretrofit.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInitializer {
    private val retrofit: Retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public-api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getInstance(): Retrofit{
        return retrofit
    }
}