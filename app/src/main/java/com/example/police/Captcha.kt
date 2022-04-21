package com.example.police

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Captcha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captcha)
    }

    fun capthaB(view: View) {
        val intent = Intent(this, MainGuest::class.java)
        startActivity(intent)
    }
}