package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var MyText:TextView
    lateinit var MyButton:Button
    lateinit var MyButton2:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyButton=findViewById(R.id.myButton)
        MyButton2=findViewById(R.id.myButton2)
        MyText=findViewById(R.id.textView)


        MyButton.setOnClickListener {
            MyText.isVisible=false
        }
        MyButton2.setOnClickListener {
            MyText.isVisible=true
        }
    }
}