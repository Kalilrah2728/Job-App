package com.example.jobapp.create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jobapp.R
import com.example.jobapp.create.viewmodel.CreateviewModel
import com.example.jobapp.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {

    lateinit var dataBinding: ActivityCreateBinding
    lateinit var viewModel: CreateviewModel
    var data = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_create)
        viewModel = ViewModelProvider(this)[CreateviewModel::class.java]
        dataBinding.apply {
            this.lifecycleOwner = this@CreateActivity
            this.createviewmodel = viewModel
        }

        viewModel.submit.observe(this){
            if (it) {
                if (data=="true") {
                    dataBinding.submit.setBackgroundResource(R.drawable.chatbg)
                    data = "false"
                } else {
                    dataBinding.submit.setBackgroundResource(R.drawable.chatbg1)
                    data = "true"
                }
            }
        }
    }
}