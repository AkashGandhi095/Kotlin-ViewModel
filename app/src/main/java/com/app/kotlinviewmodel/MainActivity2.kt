package com.app.kotlinviewmodel

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.app.kotlinviewmodel.viewModel.CounterViewModel
import com.google.android.material.button.MaterialButton
import kotlin.math.log

private const val TAG = "MainActivity2Screen"
class MainActivity2 :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timerText = findViewById<TextView>(R.id.textView2)
        val startBt = findViewById<MaterialButton>(R.id.startBt)
        val counterViewModel = ViewModelProvider(this)[CounterViewModel ::class.java]



        startBt.setOnClickListener {
            if (!counterViewModel.isTimerAlreadyRunning) {
                counterViewModel.startTimer()
            }

        }

        counterViewModel.getLiveTimePos.observe(this , {
            timerText.text = it.toString()
        })

        counterViewModel.getLiveFinishStatus.observe(this , { isFinished ->
            if (isFinished) {
                Toast.makeText(this , "Timer Finished" , Toast.LENGTH_SHORT).show()
            }
        })

    }
}