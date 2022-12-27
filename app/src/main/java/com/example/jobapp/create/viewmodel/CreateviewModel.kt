package com.example.jobapp.create.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreateviewModel : ViewModel() {

    val submit = MutableLiveData(false)

    fun onHandleClick(view: View, string: String) {
        when (string) {
            "submit" -> {
                submit.value = true
            }
        }
    }

}