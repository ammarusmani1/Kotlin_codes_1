package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySeekBarBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpinnerBinding

    val items = arrayOf("Pakistan","England","China","Japan","India","Spain")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spSpinner.adapter = ArrayAdapter<String> (this,android.R.layout.simple_expandable_list_item_1,items)

        binding.spSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                binding.tvResult.text = "Please Select Your Country"

                binding.tvResult.text = items.get(position.toInt())

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }


        }







    }
}