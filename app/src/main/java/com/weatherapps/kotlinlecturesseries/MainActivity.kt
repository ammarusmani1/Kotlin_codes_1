package com.weatherapps.kotlinlecturesseries

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.weatherapps.kotlinlecturesseries.databinding.ActivityEditTextBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



       binding.btnProgress.setOnClickListener{

           var prg = ProgressDialog(this)
           prg.setMessage("Please wait.......")
           prg.setCancelable(false)
           Handler().postDelayed({prg.dismiss()},5000)
           prg.show()

       }






    }
}