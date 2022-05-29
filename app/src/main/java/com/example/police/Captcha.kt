package com.example.police

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Captcha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_captcha)

        val randomString = getRandomString(4)
        val captchaView:TextView = findViewById(R.id.imageView6)
        captchaView.setText(randomString)
    }

    fun capthaB(view: View) {
        val captchaEnter:EditText = findViewById(R.id.editTextTextPersonName4)
        val control:TextView = findViewById(R.id.imageView6)

        Log.e("info", captchaEnter.text.toString())

        if (captchaEnter.text.toString() == control.text.toString()){
        val intent = Intent(this, MainGuest::class.java)
        startActivity(intent)
        } else{
            Toast.makeText(this, "Капча введена неверно", Toast.LENGTH_SHORT).show()
            val randomString = getRandomString(4)
            control.setText(randomString)
            captchaEnter.text = null
        }
    }

    fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}