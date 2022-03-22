package com.jsstech.loginactivity

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.snackcorner_activity.*

class SnackCornerActivity:AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var list= arrayOf(1,2,3,4,5,6,7,8,9,10)
    lateinit var cbImarti:CheckBox
    lateinit var cbLaddoo:CheckBox
    lateinit var cbKajuBarfi:CheckBox
    lateinit var cbSandesh:CheckBox
    lateinit var cbJalebi:CheckBox
    lateinit var cbSlice:CheckBox
    lateinit var cbCocaCola:CheckBox
    lateinit var cbPepsi:CheckBox
    lateinit var cbGulabjamun:CheckBox
    lateinit var radioGr:RadioGroup
    lateinit var radioBtYes:RadioButton
    lateinit var radioBtNo:RadioButton
    lateinit var btnTotal:Button
    lateinit var countSpin:Spinner
    var totalAmount = 0
    var quantityValue=0
    //var countitem:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.snackcorner_activity)

        initView()
       // initClickListener()
        initButtonListener()
        initSpinListener()
    }

    private fun initSpinListener() {
        countSpin.onItemSelectedListener=this
    }

    private fun initButtonListener() {

        btnTotal.setOnClickListener {
            initSpinListener()
//            var totalAmount = 0
            //val quantityValue=list
            val result = StringBuilder()
            result.append("Selected Items")
            if (cbImarti.isChecked) {
                result.append("\nImarti 100Rs & number of plates")

                totalAmount += 100
            }



            if (cbLaddoo.isChecked) {
                result.append("\nLaddoo 50Rs")
                totalAmount += 50
            }
            if (cbKajuBarfi.isChecked) {
                result.append("\nKajuBarfi 150Rs")
                totalAmount += 150
            }
            if (cbSandesh.isChecked) {
                result.append("\nSandesh 200Rs")
                totalAmount += 200
            }
            if (cbJalebi.isChecked) {
                result.append("\njalebi 40Rs")
                totalAmount += 40
            }
            if (cbGulabjamun.isChecked) {
                result.append("\nGulabjamun 80Rs")
                totalAmount += 80
            }
            if (cbPepsi.isChecked) {
                result.append("\nPepsi 50Rs")
                totalAmount += 50
            }
            if (cbCocaCola.isChecked) {
                result.append("\nCocacola 70Rs")
                totalAmount += 70
            }
            if (cbSlice.isChecked) {
                result.append("\nSlice 60Rs")
                totalAmount += 60
            }

            result.append("\nTotal: " +totalAmount + "Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_LONG).show()
            //totalAmount*=quantityValue
        }

    }


    private fun initView() {
        cbImarti = findViewById(R.id.cb_imarti)
        cbLaddoo = findViewById(R.id.cb_laddoo)
        cbKajuBarfi = findViewById(R.id.cb_kajubarfi)
        cbSandesh = findViewById(R.id.cb_sandesh)
        cbJalebi = findViewById(R.id.cb_jalebi)
        cbGulabjamun = findViewById(R.id.cb_gulab_jamun)
        cbSlice = findViewById(R.id.cb_Slice)
        cbPepsi = findViewById(R.id.cb_Pepsi)
        cbCocaCola = findViewById(R.id.cb_CocaCola)
        radioBtYes = findViewById(R.id.rdb_yes)
        radioGr = findViewById(R.id.radio_Group)
        radioBtNo = findViewById(R.id.rdb_no)
        btnTotal = findViewById(R.id.bt_total)
        countSpin=findViewById(R.id.spin_count)
        //val arrayAdpt=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,list)
        val arrayAdpt=ArrayAdapter(this,R.layout.color_spinner_layout,list)
        countSpin.adapter=arrayAdpt
    }

    private fun initClickListener() {
        cbImarti.setOnClickListener({
            Toast.makeText(this,"Imarti",Toast.LENGTH_LONG).show()
        })
        cbLaddoo.setOnClickListener({
            Toast.makeText(this,"Laddoo",Toast.LENGTH_LONG).show()
        })
        cbKajuBarfi.setOnClickListener({
            Toast.makeText(this,"Kajubarfi",Toast.LENGTH_LONG).show()
        })
        cbSandesh.setOnClickListener({
            Toast.makeText(this,"Sandesh",Toast.LENGTH_LONG).show()
        })
        cbJalebi.setOnClickListener({
            Toast.makeText(this,"Jalbi",Toast.LENGTH_LONG).show()
        })
        cbGulabjamun.setOnClickListener({
            Toast.makeText(this,"GulabJamun",Toast.LENGTH_LONG).show()
        })
        cbPepsi.setOnClickListener({
            Toast.makeText(this,"Pepsi",Toast.LENGTH_LONG).show()

        })
        cbCocaCola.setOnClickListener({
            Toast.makeText(this,"Coca cola",Toast.LENGTH_LONG).show()
        })
        cbSlice.setOnClickListener({
            Toast.makeText(this,"Slice",Toast.LENGTH_LONG).show()
        })
//        radioBtYes.setOnClickListener({
//            Toast.makeText(this,"Yes",Toast.LENGTH_LONG).show()
//        })
        radioGr.setOnCheckedChangeListener({radio_Group,position->
            radioBtYes=findViewById(position)
            Toast.makeText(this,radioBtYes.text,Toast.LENGTH_LONG).show()
//            radioBtNo=findViewById(position)
//            Toast.makeText(this,radioBtNo.text,Toast.LENGTH_LONG).show()
        })
       radioBtNo.setOnClickListener({
            Toast.makeText(this,"No",Toast.LENGTH_LONG).show()
       })

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
         quantityValue=list[p2]
        Toast.makeText(this,"$quantityValue",Toast.LENGTH_LONG).show()




    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}


