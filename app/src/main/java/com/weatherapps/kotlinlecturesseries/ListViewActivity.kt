package com.weatherapps.kotlinlecturesseries

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListViewBinding

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
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val arrayAdapter = ArrayAdapter<String>(this, R.layout.simple_expandable_list_item_1,suggestion)


        binding.list.adapter = arrayAdapter

        binding.list.setOnItemClickListener{
            adapterView ,View ,position,l->

            if(position==0)
            {
                Toast.makeText(this,"postion = $position",Toast.LENGTH_SHORT).show()

            }
        }




    }
}