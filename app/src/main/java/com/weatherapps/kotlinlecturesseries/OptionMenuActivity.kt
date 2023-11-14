package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class OptionMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)
    }


    //Override method

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true


    }

    //Override method 2
    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        return when(item.itemId)
        {
            R.id.share -> {
                Toast.makeText(applicationContext, "Share Selected", Toast.LENGTH_SHORT).show()
                return true

            }

            R.id.edit -> {
                Toast.makeText(applicationContext, "Edit Selected", Toast.LENGTH_SHORT).show()
                return true

            }


            R.id.open -> {
                Toast.makeText(applicationContext, "Open Selected", Toast.LENGTH_SHORT).show()
                return true



            }

            else ->  return super.onOptionsItemSelected(item)

        }


    }
}