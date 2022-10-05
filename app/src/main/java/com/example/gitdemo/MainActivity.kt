package com.example.gitdemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number = savedInstanceState?.getInt("NUMBER")?:0
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "$number"
        }
        findViewById<Button>(R.id.buttonAdd).apply {
            setOnClickListener {
                textView.text = "${++number}"
            }
        }
        findViewById<Button>(R.id.buttonMinus).apply {
            setOnClickListener {
                textView.text = "${--number}"
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("NUMBER",number)
    }
}