package com.jsstech.loginactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register_activity.*
import java.util.regex.Pattern

class RegisterActivity: AppCompatActivity() {
   private lateinit var loginUserNameEdt:EditText
   private lateinit var loginUserPassEdt:EditText
   private lateinit var loginBt:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        Log.d("msg","I am from onCreate block at Register Activity")
        initView()
    }


    private fun initView() {
        loginUserNameEdt=findViewById(R.id.login_userName_editText)
        loginUserPassEdt=findViewById(R.id.login_password_editText)
        loginBt=findViewById(R.id.bt_login)
       loginBt.setOnClickListener {

            //Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show()
            val intent=Intent(this,SnackCornerActivity::class.java)
            startActivity(intent)
        }
    }



    override fun onStart() {
        super.onStart()
        Log.d("msg","I am called from onStart block Register Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("msg","I am called from onResume block Register Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("msg","I am called from onPause block Register Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("msg","I am called from onStop block Register Activity")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("msg","I am  called from onRestart block Register Activitty")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("msg","I am called from onDestroy block Register Activity")

    }


}