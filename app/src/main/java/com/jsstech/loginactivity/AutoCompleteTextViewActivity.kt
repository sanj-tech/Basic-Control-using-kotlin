package com.jsstech.loginactivity

import android.graphics.Color
import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_autocomplete_textview.*

class AutoCompleteTextViewActivity : AppCompatActivity() {
    lateinit var autoCompleteTv: AutoCompleteTextView
    var fruitList = mutableListOf(
        "Papaya", "PineApple", "CusterdApple", "WaterMelon", "Grapes",
        "Guava", "Lime", "Sweet-Lime", "Pomegranate", "Chikoo"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete_textview)
        initView()
    }

    private fun initView() {
        autoCompleteTv = findViewById(R.id.autoComplete_tv)
        var fruitsAdapter = ArrayAdapter(
            this, android.R.layout.select_dialog_item, fruitList
        )
        autoCompleteTv.setAdapter(fruitsAdapter)


        autoCompleteTv.setTextColor(Color.WHITE)
        autoCompleteTv.setBackgroundColor(Color.MAGENTA)
        autoCompleteTv.setOnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position).toString()
            Toast.makeText(this, "$selectedItem", Toast.LENGTH_LONG).show()

        }


    }
}