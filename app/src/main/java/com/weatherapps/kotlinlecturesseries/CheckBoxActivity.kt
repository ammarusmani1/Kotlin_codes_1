package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivityCheckBoxBinding

class CheckBoxActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCheckBoxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCheckBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubmit.setOnClickListener{

            if(binding.cbCricket.isChecked && !binding.cbFootball.isChecked)
            {
                Toast.makeText(this, "Cricket", Toast.LENGTH_SHORT).show()
            }
             if(binding.cbFootball.isChecked && !binding.cbCricket.isChecked)
            {
                Toast.makeText(this, "FootBall", Toast.LENGTH_SHORT).show()
            }
             if(binding.cbFootball.isChecked && binding.cbCricket.isChecked)
            {
                Toast.makeText(this, "Cricket + Football", Toast.LENGTH_SHORT).show()
            }
            if(!binding.cbCricket.isChecked && !binding.cbFootball.isChecked)
            {
                Toast.makeText(this, "please select checkbox value", Toast.LENGTH_SHORT).show()
            }



        }





    }
}