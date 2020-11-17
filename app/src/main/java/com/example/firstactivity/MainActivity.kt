package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollbutton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar4)

        rollButton.setOnClickListener {
            val rand = Random.nextInt(seekBar.progress)
            resultTextView.text = rand.toString()
            }
        }
    }
