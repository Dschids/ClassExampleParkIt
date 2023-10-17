package com.example.classexampleparkit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc = findViewById<Button>(R.id.btnCalc)

        btnCalc.setOnClickListener {
            // TODO call a function, toast
            println("Hi")
        }


    }
}