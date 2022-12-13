package com.example.minicalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            symbol.text = "+"
            var anum1 = editTextTextPersonName.text.toString()
            var anum2 = editTextTextPersonName2.text.toString()
            if(anum1 == "" || anum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                symbol.text = ""
                editTextTextPersonName.setText("")
                editTextTextPersonName.setText("")
            }
            else {
                var total = anum1.toDouble() + anum2.toDouble()
                editTextTextPersonName3.setText(total.toString())
            }
        }
        button2.setOnClickListener {
            symbol.text = "-"
            var anum1 = editTextTextPersonName.text.toString()
            var anum2 = editTextTextPersonName2.text.toString()
            if(anum1 == "" || anum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                symbol.text = ""
                editTextTextPersonName.setText("")
                editTextTextPersonName.setText("")
            }
            else {
                var total = anum1.toDouble() - anum2.toDouble()
                editTextTextPersonName3.setText(total.toString())
            }
        }
        button3.setOnClickListener {
            symbol.text = "*"
            var anum1 = editTextTextPersonName.text.toString()
            var anum2 = editTextTextPersonName2.text.toString()
            if(anum1 == "" || anum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                symbol.text = ""
                editTextTextPersonName.setText("")
                editTextTextPersonName.setText("")
            }
            else {
                var total = anum1.toDouble() * anum2.toDouble()
                editTextTextPersonName3.setText(total.toString())
            }
        }
        button4.setOnClickListener {
            symbol.text = "/"
            var anum1 = editTextTextPersonName.text.toString()
            var anum2 = editTextTextPersonName2.text.toString()
            if(anum1 == "" || anum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                symbol.text = ""
                editTextTextPersonName.setText("")
                editTextTextPersonName.setText("")
            }
            else {
                var total = anum1.toDouble() / anum2.toDouble()
                editTextTextPersonName3.setText(total.toString())
            }
        }
        button5.setOnClickListener {
            symbol.text = "%"
            var anum1 = editTextTextPersonName.text.toString()
            var anum2 = editTextTextPersonName2.text.toString()
            if(anum1 == "" || anum2 == ""){
                toast {
                    "Please Input Num1 and Num2!!!"
                }
                symbol.text = ""
                editTextTextPersonName.setText("")
                editTextTextPersonName.setText("")
            }
            else {
                var total = anum1.toDouble() % anum2.toDouble()
                editTextTextPersonName3.setText(total.toString())
            }
        }
        button6.setOnClickListener {
            editTextTextPersonName.setText(" ")
            editTextTextPersonName2.setText(" ")
            editTextTextPersonName3.setText(" ")
            symbol.setText(" ")
        }

    }
}
inline fun Context.toast(message:()->String){
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}