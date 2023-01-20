package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var nameinput : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createcard(view: View) {
        nameinput = findViewById(R.id.nameinput)
        val name = nameinput.text.toString()
        val message = "button was clicked $name"
        val intent = Intent( this, Greeeting::class.java)
        intent.putExtra("name", name)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        startActivity(intent)

    }
}