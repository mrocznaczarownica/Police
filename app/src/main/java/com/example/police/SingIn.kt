package com.example.police

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class SingIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
    }

    fun sign_in(view: View) {
        val intent = Intent(this, Captcha::class.java)
        startActivity(intent)
    }
}