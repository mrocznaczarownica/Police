package com.example.police

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PhotoRobot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_robot)
    }

    fun new_robot(view: View) {
        val intent = Intent(this, NewPhotoRobots::class.java)
        startActivity(intent)
    }
}