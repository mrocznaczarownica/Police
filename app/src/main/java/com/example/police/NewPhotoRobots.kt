package com.example.police

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewPhotoRobots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_photo_robots)
    }

    fun robots(view: View) {
        val intent = Intent(this, PhotoRobot::class.java)
        startActivity(intent)
    }
}