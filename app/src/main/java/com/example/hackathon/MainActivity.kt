package com.example.hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun signUp(view: View)
    {
        setContentView(R.layout.activity_sign_up)
    }
    fun signIn(view: View)
    {
        setContentView(R.layout.activity_sign_in)
    }
    fun skip(view: View)
    {
        setContentView(R.layout.activity_screen3)
    }
}
