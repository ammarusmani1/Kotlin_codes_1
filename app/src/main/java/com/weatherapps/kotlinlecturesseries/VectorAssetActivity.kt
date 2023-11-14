package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.weatherapps.kotlinlecturesseries.databinding.ActivityVectorAssetBinding

class VectorAssetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVectorAssetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVectorAssetBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPlay.setOnClickListener{

            binding.btnPlay.setBackgroundResource(R.drawable.ic_pause)

        }



    }
}