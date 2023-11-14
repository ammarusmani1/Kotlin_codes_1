package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySnackBarBinding

class SnackBarActivity : AppCompatActivity() {

    lateinit var binding : ActivitySnackBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button2.setOnClickListener{

            val snackbar = Snackbar.make(binding.showLayout,"WellCome",Snackbar.LENGTH_LONG)
            snackbar.setAction("TOAST",View.OnClickListener {
                //snackbar.dismiss()

                Toast.makeText(this, "please Subscribe my Channel", Toast.LENGTH_SHORT).show()
            })
            snackbar.setActionTextColor(ContextCompat.getColor(this,R.color.myColor))

            val view = snackbar.view
            view.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
            snackbar.show()

        }


    }


}