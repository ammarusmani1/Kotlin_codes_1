package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.weatherapps.kotlinlecturesseries.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnFragmentOne.setOnClickListener{

        replaceFragment(FragmentOne())

        }

        binding.btnFragmentTwo.setOnClickListener{

            replaceFragment(FragmentTwo())


        }



    }


        private fun replaceFragment(fragment : Fragment)
        {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_Layout,fragment)
             fragmentTransaction.commit()

        }


}