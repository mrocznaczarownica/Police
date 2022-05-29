package com.example.police

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.police.recadapters.MyMenu
import com.example.police.recadapters.menuData
import com.example.police.recadapters.menuRecycler

class MainGuest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_guest)

        val menu : RecyclerView = findViewById(R.id.recyclerView1)
        menu.adapter = menuRecycler(MyMenu().list)
    }
}
