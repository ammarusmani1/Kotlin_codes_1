package com.weatherapps.kotlinlecturesseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.weatherapps.kotlinlecturesseries.databinding.ActivityAlertDialogBinding
import com.weatherapps.kotlinlecturesseries.databinding.ActivitySecondBinding

class AlertDialogActivity : AppCompatActivity() {


    private lateinit var binding : ActivityAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAlert.setOnClickListener{

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Delete")
            alert.setIcon(android.R.drawable.ic_dialog_alert)
            alert.setMessage("Do you want to Delete!!")
            alert.setPositiveButton("Yes")
            {
             dialogInterface,i ->
                Toast.makeText(this,"Deleted",Toast.LENGTH_SHORT).show()
            }

            alert.setNegativeButton("Cancel"){
                dialogInterface,i ->

                Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()


            }

            alert.show()

        }


    }
}