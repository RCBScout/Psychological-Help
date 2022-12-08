package com.vitaliymatr.psychologicalhelp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        val helpTextView: TextView = findViewById(R.id.helpTextView)
        val situationTextView:TextView = findViewById(R.id.situationTextView)
        val imageView: ImageView = findViewById(R.id.imageView)

        val intent = intent

        val bigText = intent.getStringExtra("bigText")
        val situation = intent.getStringExtra("situation")
        val numberOfPicture = intent.getIntExtra("numberOfPicture", 0)
        situationTextView.text = situation
        helpTextView.text = bigText
        when(numberOfPicture){
            1 -> imageView.setImageResource(R.drawable.help1)
            2 -> imageView.setImageResource(R.drawable.help2)
            3 -> imageView.setImageResource(R.drawable.help3)
            4 -> imageView.setImageResource(R.drawable.help4)
            5 -> imageView.setImageResource(R.drawable.help5)
            6 -> imageView.setImageResource(R.drawable.help6)
            7 -> imageView.setImageResource(R.drawable.help7)
            8 -> imageView.setImageResource(R.drawable.help8)
            9 -> imageView.setImageResource(R.drawable.help9)
            10 -> imageView.setImageResource(R.drawable.help10)
            11 -> imageView.setImageResource(R.drawable.help11)
            12 -> imageView.setImageResource(R.drawable.help12)
            13 -> imageView.setImageResource(R.drawable.help13)
            14 -> imageView.setImageResource(R.drawable.help14)
            15 -> imageView.setImageResource(R.drawable.help15)
        }

    }
}