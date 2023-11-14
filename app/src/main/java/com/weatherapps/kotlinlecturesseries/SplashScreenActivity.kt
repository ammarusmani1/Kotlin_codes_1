package com.weatherapps.kotlinlecturesseries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



        val screen = object :Thread()
        {

            //Override run method

            override fun run() {
                Thread.sleep(3000)
                val intent =Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
            }

        }

        screen.start()

    }
}