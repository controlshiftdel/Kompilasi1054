package com.example.fintech9maret

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private  lateinit var  buttonSubmit : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener{
            val angka1 = findViewById<EditText>(R.id.Angka1)
            val angka2 = findViewById<EditText>(R.id.Angka2)
            val hasil = findViewById<TextView>(R.id.hasil)

            var jumlah = angka1.text.toString().toDouble() + angka2.text.toString().toDouble()
            hasil.text = jumlah.toString()

        }

    }
}