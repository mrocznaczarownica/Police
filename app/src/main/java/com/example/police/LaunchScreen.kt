package com.example.police

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = object: CountDownTimer(3000,1000) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                val intent = Intent(this@LaunchScreen, SingIn::class.java)
                startActivity(intent)
            }

        }.start()
    }

    private fun Intent(launchScreen: LaunchScreen, java: Class<SingIn>): Any {

    }
}