package com.example.helloworldapp3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //for the printed signature
        val textView = findViewById<TextView>(R.id.textPrint)
        //for the user input
        val editText = findViewById<EditText>(R.id.enterText)
        //for button
        val button = findViewById<Button>(R.id.button)
        //create a list of fonts to be changed during runtime
        val fonts=mutableListOf(
         ResourcesCompat.getFont(this,R.font.aauto),
         ResourcesCompat.getFont(this,R.font.autography),
         ResourcesCompat.getFont(this,R.font.brittiney),
         ResourcesCompat.getFont(this,R.font.max),
         ResourcesCompat.getFont(this,R.font.personal),
         ResourcesCompat.getFont(this,R.font.sevendays),
         ResourcesCompat.getFont(this,R.font.theprestige)
        )
        //when user click it will change the font
        button.setOnClickListener {
            textView.setTypeface(fonts[Random.nextInt(7)])
            textView.text= editText.text
        }
    }
}