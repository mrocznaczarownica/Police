package com.example.police.recadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.police.R

class menuRecycler(val list:ArrayList<menuData>): RecyclerView.Adapter<menuRecycler.MyVH>() {

    class MyVH(itemView:View):RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.imageView)
        val textView:TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVH {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.menu_layout, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.textView.setText(list[position].manePos)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}