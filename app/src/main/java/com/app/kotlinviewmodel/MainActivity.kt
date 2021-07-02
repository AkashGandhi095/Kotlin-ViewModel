package com.app.kotlinviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.app.kotlinviewmodel.viewModel.MainViewModel
import com.google.android.material.button.MaterialButton

private const val TAG = "MainActivityScreen"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

       /* val mainViewModel = ViewModelProvider(this)[MainViewModel ::class.java]
        Log.d(TAG, "onCreate: MainActivity code : ${this.hashCode()}")
        Log.d(TAG, "onCreate: mainViewModel code : ${mainViewModel.hashCode()}")



        textView.text = mainViewModel.num.toString()

        incBt.setOnClickListener {
            mainViewModel.incNumber()
            // this will call num again & again on Click..
            textView.text = mainViewModel.num.toString()
        }*/
    }
}