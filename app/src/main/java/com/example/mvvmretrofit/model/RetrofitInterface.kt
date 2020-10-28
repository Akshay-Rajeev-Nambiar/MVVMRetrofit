package com.example.mvvmretrofit.model

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("users")
    fun getUserData() : Call<UserResponseData>
}