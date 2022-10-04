package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "0"
        }
        findViewById<Button>(R.id.buttonAdd).apply {
            setOnClickListener {
                textView.text = "${++number}"
            }
        }
    }
}