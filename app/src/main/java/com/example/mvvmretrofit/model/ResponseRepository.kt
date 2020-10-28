package com.example.mvvmretrofit.model

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResponseRepository {
    private val retrofit = RetrofitInitializer.getInstance()
    private val apiInterface = retrofit.create(RetrofitInterface::class.java)
    fun getUserData(apiResponseInterface: APIResponseInterface){
        val userResponseData: Call<UserResponseData> = apiInterface.getUserData()
        userResponseData.enqueue(object : Callback<UserResponseData>{
            override fun onResponse(
                call: Call<UserResponseData>,
                response: Response<UserResponseData>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it.data)
                }
            }
            override fun onFailure(call: Call<UserResponseData>, t: Throwable) {
                apiResponseInterface.onFailure(t)
            }
        })
    }
}