package com.example.mvvmretrofit.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mvvmretrofit.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val intent = Intent(this, ResponseActivity::class.java)
        intent.putExtra("BUTTON_ID", view.id)
        startActivity(intent)
    }
}