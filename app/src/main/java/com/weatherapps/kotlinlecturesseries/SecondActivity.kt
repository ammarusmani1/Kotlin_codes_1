package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.weatherapps.kotlinlecturesseries.databinding.ActivityEditTextBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle:Bundle?=intent.extras
        val firstText = bundle?.get("key")
        val secondText = bundle?.get("key2")


        binding.textView.text =firstText.toString()
        binding.textView2.text= secondText.toString()





    }
}