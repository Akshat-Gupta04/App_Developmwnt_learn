package com.example.firstapp11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        call/access button b_1
        val btnClickMe = findViewById<Button>(R.id.b_1)
        val tvMyTextView = findViewById<TextView>(R.id.tv_1)
//        define a variable
        var v1=0
//        btnClickMe.text="text change"
        btnClickMe.setOnClickListener{
            btnClickMe.text="button is now clicked!!!"
            tvMyTextView.text="my self Akshat, and this is my first app"
//          manuplating varrible
            v1 +=1
//            add number to text(string)
            tvMyTextView.text= v1.toString()
//            make a toast(pop up)
            Toast.makeText(this," hey this is a Toast ",Toast.LENGTH_LONG).show()


        }
    }
}