package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivityRadioButtonMainBinding

class RadioButtonMainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityRadioButtonMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRadioButtonMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnSubmit.setOnClickListener{

            if(binding.rbMale.isChecked)
            {
                Toast.makeText(this, "male", Toast.LENGTH_SHORT).show()
            }

            if(binding.rbFemale.isChecked)
            {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show()
            }




        }



    }
}