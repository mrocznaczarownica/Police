package com.example.police

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SingIn : AppCompatActivity() {

    lateinit var sqlHelper:DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
    }

    fun sign_in(view: View) {
        var login:EditText = findViewById(R.id.editTextTextPersonName)
        var pass:EditText = findViewById(R.id.editTextTextPassword)

        sqlHelper = DBHelper(this)
        val user = users(login = login.text.toString(), pass = pass.text.toString())
        val success = sqlHelper.setPassword(user)
        if(success > -1){
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainGuest::class.java)
            startActivity(intent)}
        else {
            Toast.makeText(this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, Captcha::class.java)
//            startActivity(intent)
        }
    }

    fun guestClick(view: android.view.View) {
        val intent = Intent(this, Captcha::class.java)
        startActivity(intent)
    }
}