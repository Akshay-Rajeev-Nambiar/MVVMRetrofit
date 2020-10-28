package com.example.mvvmretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mvvmretrofit.R

class ResponseActivity : AppCompatActivity() {
    private val usersFragment = UsersFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)
        val intent = intent
        val btnId = intent.getIntExtra("BUTTON_ID", 0)
        showFragment(btnId)
    }

    private fun showFragment(id: Int) {
        when (id) {
            R.id.users_btn -> replaceFragment(usersFragment)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_frame, fragment)
            .commit()
    }
}

