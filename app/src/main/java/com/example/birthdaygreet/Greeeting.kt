package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greeeting : AppCompatActivity() {
    lateinit var greetingname : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeeting)
        greetingname = findViewById(R.id.greetingname)
        val name = intent.getStringExtra("name")
        val message = "Happy Birthday\n$name"
        greetingname.text = message

    }
}