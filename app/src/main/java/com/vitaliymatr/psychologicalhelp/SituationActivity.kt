package com.vitaliymatr.psychologicalhelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.TypedArrayUtils

class SituationActivity : AppCompatActivity() {

    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_situation)
        editText = findViewById(R.id.editText)
        var button: Button = findViewById(R.id.button)
        button.setOnClickListener { goToHelp() }
    }

    private fun goToHelp() {
        val situationLow: String = editText.text.toString().lowercase()
        val situation: String = editText.text.toString()

        if (situation.isBlank()) {
            Toast.makeText(this, "Напишите хоть слово", Toast.LENGTH_LONG).show()
        } else {
            var processor = Processor(situationLow)

            processor.addWords()
            processor.getHelp()

            var bigText = processor.bigText
            var numberOfPicture = processor.numberOfPicture

            intent = Intent(this, HelpActivity::class.java)
            intent.putExtra("bigText", bigText)
            intent.putExtra("situation", situation)
            intent.putExtra("numberOfPicture", numberOfPicture)
            startActivity(intent)
        }

    }
}