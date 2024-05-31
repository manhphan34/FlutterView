package com.example.testflutter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val text = findViewById<TextView>(R.id.txtTest)
        val button = findViewById<Button>(R.id.btnTest)

        button.setOnClickListener {
            text.text = "Current day: ${Calendar.getInstance().time}"
        }
    }
}