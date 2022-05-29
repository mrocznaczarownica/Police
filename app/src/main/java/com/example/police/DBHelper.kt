package com.example.police

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context):SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object{
        private val DATABASE_NAME = "AH1.db"
        private val DATABASE_VERSION = 1

        private val users = "users"
        private val login = "login"
        private val pass = "pass"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val users = ("CREATE TABLE $users (" +
                "login TEXT PRIMARY KEY," +
                "pass TEXT)")
        db?.execSQL(users)
    }

    fun setPassword(log:String, password:String): Long {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put("login", log)
        values.put("pass", password)

        val success = db.insert("$users", null, values)
        db.close()
        return success
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $users")
        onCreate(db)
    }

    fun getPasswords(log:String, password:String):ArrayList<users>{
        val usList:ArrayList<users> = ArrayList()

        val query = "SELECT * FROM $users WHERE login = '${log}' AND pass = '${password}'"
        val db = this.readableDatabase

        val cursor:Cursor?
        cursor = db.rawQuery(query, null)

        var login:String
        var pass:String
        if(cursor.moveToFirst()){
            do {
                login = cursor.getString(0)
                pass = cursor.getString(1)
                val us = users(login = login, pass = pass)
                usList.add(us)
            }while (cursor.moveToNext())
        }
        return usList
    }

    fun setPassword(std:users): Long {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put("$login", std.login)
        values.put("$pass", std.pass)

        val success = db.insert("$users", null, values)
        db.close()
        return success
    }
}