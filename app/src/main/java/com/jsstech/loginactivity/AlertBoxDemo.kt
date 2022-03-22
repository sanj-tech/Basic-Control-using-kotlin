package com.jsstech.loginactivity

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlertBoxDemo : AppCompatActivity() {
    lateinit var alertButton: Button
    lateinit var alertDialog:AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_alertbox)
        initView()


    }

    private fun initView() {
        //alertButton = findViewById(R.id.alert_submit)
       // alertButton.setOnClickListener {
            var builder = AlertDialog.Builder(this)
            builder.setMessage("Are you want to submit?")
            builder.setTitle("AlertBox")
            builder.setIcon(R.drawable.shape)

//            builder.setPositiveButton("yes") { dialogInterface, which->
//                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
            builder.setPositiveButton("yes") { dialogInterface: DialogInterface, i: Int ->
                var intent=Intent(applicationContext,RegisterActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "yes button is clicked", Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){ dialogInterface: DialogInterface, i: Int ->
                Toast.makeText(applicationContext, "Cancel button is clicked", Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){ dialogInterface: DialogInterface, i: Int ->
                var intent=Intent(applicationContext,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "No button is clicked", Toast.LENGTH_LONG).show()
            }
            alertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()


    }

}

