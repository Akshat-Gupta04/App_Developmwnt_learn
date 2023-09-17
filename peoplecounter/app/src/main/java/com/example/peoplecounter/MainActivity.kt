package com.example.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClick1 = findViewById<Button>(R.id.button_1)
        val textCounter = findViewById<TextView>(R.id.textView_1)
        var timesClicked=0
        btnClick1.setOnClickListener {
            timesClicked+=1
            textCounter.text=timesClicked.toString()
            Toast.makeText(this," Count increased by 1 ", Toast.LENGTH_SHORT).show()


        }
    }
}