package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySwitchButton2Binding

class Switch_ButtonActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySwitchButton2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwitchButton2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.switchAutoPlay.setOnClickListener{
            if(binding.switchAutoPlay.isChecked)



            {


                binding.tvMarquee.text = "If everything was perfect you would never learn and you would never grow"

                binding.tvMarquee.setSingleLine()

                binding.tvMarquee.ellipsize = TextUtils.TruncateAt.MARQUEE

                binding.tvMarquee.marqueeRepeatLimit = -1

                binding.tvMarquee.isSelected = false


                Toast.makeText(this, "AutoPlay Selected", Toast.LENGTH_SHORT).show()
            }
        }

        binding.SwitchOnOff.setOnClickListener{

            if(binding.SwitchOnOff.isChecked)
            {
                Toast.makeText(this, "On Selected", Toast.LENGTH_SHORT).show()
            }


        }



        //Marquee TextView Code

        binding.tvMarquee.text = "If everything was perfect you would never learn and you would never grow"

        binding.tvMarquee.setSingleLine()

        binding.tvMarquee.ellipsize = TextUtils.TruncateAt.MARQUEE

        binding.tvMarquee.marqueeRepeatLimit = -1

        binding.tvMarquee.isSelected = true




    }
}