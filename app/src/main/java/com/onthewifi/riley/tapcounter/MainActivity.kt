package com.onthewifi.riley.tapcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        val countButton: Button = findViewById(R.id.countButton)
        val clearButton: FloatingActionButton = findViewById(R.id.clearButton)

        countButton.text = 0.toString()

        countButton.setOnClickListener {
            count++
            countButton.text = count.toString()
        }

        clearButton.setOnClickListener {
            count = 0
            countButton.text = count.toString()
        }
    }


}
