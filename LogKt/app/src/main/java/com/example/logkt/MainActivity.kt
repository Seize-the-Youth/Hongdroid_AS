package com.example.logkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var a : Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = 2

        if(a == 2) {
            Log.d("if 문", "ENTER")
            Log.e("if 문", "ENTER") // error로 찍힌다. 새빨갛게~~
        }
        else if (a == 1) {
            Log.d("else if 문", "ENTER")
            Log.e("else if 문", "ENTER")
        }
    }
}