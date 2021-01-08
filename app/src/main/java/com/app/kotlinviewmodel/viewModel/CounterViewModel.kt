package com.app.kotlinviewmodel.viewModel

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
class CounterViewModel :ViewModel() {

    /*val liveTimerPos :MutableLiveData<Long> = MutableLiveData()*/

    private val liveTimerPos :MutableLiveData<Long> = MutableLiveData()
    var isTimerAlreadyRunning :Boolean = false
    private val isTimerFinished :MutableLiveData<Boolean> = MutableLiveData()

    fun startTimer() {
        object :CountDownTimer(10000 , 1000) {
            override fun onTick(millisUntilFinished: Long) {
                liveTimerPos.value = millisUntilFinished/1000
                isTimerAlreadyRunning = true
                isTimerFinished.value = false
            }

            override fun onFinish() {
                isTimerAlreadyRunning = false
                isTimerFinished.value = true
                Log.d(TAG, "onFinish: ")
            }

        }.start()
    }

    val getLiveTimePos :LiveData<Long>
        get() = liveTimerPos

    val getLiveFinishStatus :LiveData<Boolean>
        get() = isTimerFinished

//    var timerPos :Long = 0

}