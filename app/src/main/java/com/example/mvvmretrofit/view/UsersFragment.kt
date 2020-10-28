package com.example.mvvmretrofit.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofit.R
import com.example.mvvmretrofit.adapter.ResponseAdapter
import com.example.mvvmretrofit.model.*
import com.example.mvvmretrofit.viewmodel.ResponseViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsersFragment : Fragment(R.layout.fragment_users) {
    private lateinit var userRecyclerView: RecyclerView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRecyclerView = view.findViewById(R.id.user_rv)
        userRecyclerView.layoutManager = LinearLayoutManager(view.context)
        val responseViewModel = ViewModelProviders.of(this).get(ResponseViewModel::class.java)
        responseViewModel.getUserData(object : APIResponseInterface{
            override fun onResponse(response: List<UserData>) {
                userRecyclerView.adapter = ResponseAdapter(response)
            }

            override fun onFailure(t: Throwable) {
                Toast.makeText(view.context,t.toString(),Toast.LENGTH_SHORT).show()
            }


        })
    }
}