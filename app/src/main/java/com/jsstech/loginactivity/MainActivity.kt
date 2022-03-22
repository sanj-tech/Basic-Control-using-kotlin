package com.jsstech.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var bt_Register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("msg","I am called from onCreate block at Main Activity")

        initView()
        initListener()
    }



    private fun initView() {
        bt_Register = findViewById(R.id.btRegister)

    }
    private fun initListener() {
        bt_Register.setOnClickListener {
            val intent = Intent(this, AlertBoxDemo::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("msg","I am called from onStart block at Main Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("msg","I am called from onPause block at Main Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msg","I am called from onStop block at Main Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msg","I am called from onDestroy block at Main Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("msg","I am called from onRestart block at Main Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msg","I am called from onResume block at Main Activity")
    }
}