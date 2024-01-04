package com.example.currencyconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.edt)
        val btnRupees = findViewById<Button>(R.id.btnRupees)
        val btnDollar = findViewById<Button>(R.id.btnDollar)
        val text = findViewById<TextView>(R.id.text)

        btnRupees.setOnClickListener(){
            val amount = edt.text.toString().toInt()
            val rupeesAmount = 80*amount
            text.text = "Converted Amount ($ to Rs) : $rupeesAmount"
        }

        btnDollar.setOnClickListener(){
            val amount = edt.text.toString().toInt()
            var dollarAmount = amount/80
            text.text = "Converted Amount (Rs to $) : $dollarAmount"
        }
    }
}