package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.weatherapps.kotlinlecturesseries.databinding.ActivityContextMenuBinding

class ContextMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContextMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContextMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        registerForContextMenu(binding.btnMenu)


     //Note: Menu show kar-wane k lye button par long click karna hai




    }

    // override method Shortcut Ctrl+O

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        val inflater  = menuInflater
        inflater.inflate(R.menu.menu,menu)



    }


    //override one more method

    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when (item.itemId)
        {
            R.id.call ->
            {
                Toast.makeText(applicationContext, "Call Selected", Toast.LENGTH_SHORT).show()
                return true

            }

            R.id.sms ->
            {
                Toast.makeText(applicationContext, "Sms Selected", Toast.LENGTH_SHORT).show()
                return true

            }

            R.id.email ->
            {
                Toast.makeText(applicationContext, "Email Selected", Toast.LENGTH_SHORT).show()
                return true

            }

            else -> return super.onContextItemSelected(item)

        }
    }



}