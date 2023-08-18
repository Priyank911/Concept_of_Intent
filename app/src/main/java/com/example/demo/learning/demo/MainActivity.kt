package com.example.demo.learning.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var SubmitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     SubmitButton = findViewById(R.id.SubmitButton)

     SubmitButton.setOnClickListener{
         val intent = Intent(this, SecondActivity::class.java)
         startActivity(intent)
     }

    }
}