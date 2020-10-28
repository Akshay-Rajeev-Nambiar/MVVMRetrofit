package com.example.mvvmretrofit.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmretrofit.model.APIResponseInterface
import com.example.mvvmretrofit.model.ResponseRepository
import com.example.mvvmretrofit.model.UserData

class ResponseViewModel : ViewModel(){
    private val responseRepository = ResponseRepository()
    fun getUserData(viewCallBack: APIResponseInterface){
        responseRepository.getUserData(object : APIResponseInterface{
            override fun onResponse(response: List<UserData>) {
                viewCallBack.onResponse(response)
            }

            override fun onFailure(t: Throwable) {
                viewCallBack.onFailure(t)
            }

        })
    }
}