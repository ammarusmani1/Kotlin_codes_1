package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySeekBarBinding

class SeekBarActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySeekBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeekBarBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.seekbar.setOnSeekBarChangeListener(object :OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                binding.tvResult.text = progress.toString()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {


                binding.tvResult.text = seekBar?.progress.toString()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                binding.tvResult.text = seekBar!!.progress.toString()

            }


        })


    }
}