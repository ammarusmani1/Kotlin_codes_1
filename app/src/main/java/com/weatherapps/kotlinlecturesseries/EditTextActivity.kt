package com.weatherapps.kotlinlecturesseries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivityEditTextBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivityMainBinding

class EditTextActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityEditTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{

            val EtOne = binding.editTextText.text.toString()
            val EtTwo = binding.editTextText2.text.toString()


            Toast.makeText(this,"FirstText is = "+EtOne+"Second Text is = "+EtTwo,Toast.LENGTH_SHORT).show();
        }

        binding.btnJump.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


        binding.btnSendData.setOnClickListener {

            val msg = binding.editTextText.text.toString();
            val msg2 = binding.editTextText2.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("key",msg)
            intent.putExtra("key2",msg2)
            startActivity(intent)

        }




    }
}