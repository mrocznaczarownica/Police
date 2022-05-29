package com.example.police.recadapters

import com.example.police.R

data class menuData(val image:Int, val manePos:String)

class MyMenu{ val list = arrayListOf(
        menuData(R.drawable.dep, "Department"),
        menuData(R.drawable.want, "Wanted"),
        menuData(R.drawable.face, "PhotoRobot"),
        menuData(R.drawable.create, "Paint")
    )}
