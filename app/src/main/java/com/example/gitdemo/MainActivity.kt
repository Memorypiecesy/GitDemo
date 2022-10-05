package com.example.gitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("NUMBER",number)
    }
}