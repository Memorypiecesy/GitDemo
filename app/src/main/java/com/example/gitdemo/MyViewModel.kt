package com.example.gitdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    private val _number = MutableLiveData(0)
    val numberLiveData:LiveData<Int> = _number

    fun add(number:Int){
        _number.value = _number.value?.plus(number)
    }

    fun reset(){
        _number.value = 0
    }
}