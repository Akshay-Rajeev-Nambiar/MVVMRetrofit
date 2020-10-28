package com.example.mvvmretrofit.model

interface APIResponseInterface {
    fun onResponse(response:List<UserData>)
    fun onFailure(t:Throwable)
}