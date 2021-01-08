package com.app.kotlinviewmodel.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "MainViewModelClass"

class MainViewModel :ViewModel() {

    init {
        Log.d(TAG, "mainViewModel init..")
    }

    var num :Int = 0

    fun incNumber() {
        num++
    }

    override fun onCleared() {
        Log.d(TAG, "onCleared: viewModelCleared")
        super.onCleared()
    }


}