package com.example.police

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainGuest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_guest)
        //find listView
        var listView = findViewById<ListView>(R.id.menu2)
        //custom adapter
        var customAdapter = CustomAdapter (this)
        listView.adapter = customAdapter

    }

    fun about_us(view: View) {
        val intent = Intent(this, AboutUs::class.java)
        startActivity(intent)
    }

    fun photo_robot(view: View) {
        val intent = Intent(this, PhotoRobot::class.java)
        startActivity(intent)
    }

    fun paint(view: View) {
        val intent = Intent(this, Paint::class.java)
        startActivity(intent)
    }
}

class CustomAdapter(private val context:Activity) : BaseAdapter() {

    //array of name
    var names = arrayOf("Departments", "Wanted", "PhotoRobot", "Paint")
    //array of images
    var images = intArrayOf(R.drawable.dep, R.drawable.want, R.drawable.face, R.drawable.create)

    override fun getCount(): Int {
        return  images.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
    }

    override fun getItemId(position: Int): Long {
        return images[position].toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val inflater = context.layoutInflater
        val view1 = inflater.inflate(R.layout.row_data, parent, false)

        //find view in row_data
        val fName = view1.findViewById<TextView>(R.id.fName)
        val fImage = view1.findViewById<ImageView>(R.id.fImage)

        fName.text = names[position]
        fImage.setImageResource(images[position])
        return view1
    }

}
