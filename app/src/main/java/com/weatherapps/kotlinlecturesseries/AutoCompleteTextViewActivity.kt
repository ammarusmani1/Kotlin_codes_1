package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.weatherapps.kotlinlecturesseries.databinding.ActivityAutoCompleteTextViewBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivityEditTextBinding

class AutoCompleteTextViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAutoCompleteTextViewBinding;



    val suggestion = arrayListOf(
        "America",
        "South Africa",
        "Pakistan",
        "India",
        "Saudi Arabia",
        "Iran",
        "Iraq",
        "China",
        "England"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAutoCompleteTextViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //adapter
        // array adapter

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,suggestion)

        binding.auto.threshold=0
        binding.auto.setAdapter(adapter)
        binding.auto.setOnFocusChangeListener{

            view, hint ->if(hint)
            binding.auto.showDropDown()
        }


    }
}