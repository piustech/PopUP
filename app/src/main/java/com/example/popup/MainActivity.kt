package com.example.popup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rateMe = findViewById<TextView>(R.id.rateMe)

        rateMe.setOnClickListener {

            val dialog = CustomDialogFragment()

            dialog.show(supportFragmentManager, "PopupDialog")

        }

    }
}