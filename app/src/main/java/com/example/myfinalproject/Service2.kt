package com.example.myfinalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_service1.*
import kotlinx.android.synthetic.main.activity_service2.*

class Service2 : AppCompatActivity() {

    private lateinit var day2: EditText
    private lateinit var edtime2: EditText
    private lateinit var edphone2: EditText
    private lateinit var edtype2: EditText
    private lateinit var ednamepet2: EditText
    private lateinit var edtsex2: EditText
    private lateinit var edcom2: EditText

    private lateinit var bttsave22: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service2)

        var intent = intent

        day2 = findViewById<EditText>(R.id.day22)
        edtime2 = findViewById<EditText>(R.id.time22)
        edphone2 = findViewById<EditText>(R.id.phonenumber22)
        edtype2 = findViewById<EditText>(R.id.type22)
        ednamepet2 = findViewById<EditText>(R.id.namepet22)
        edtsex2 = findViewById<EditText>(R.id.sex22)
        edcom2 = findViewById<EditText>(R.id.comment22)

        bttsave22 = findViewById<Button>(R.id.save2)

        clear2!!.setOnClickListener {
            day2.setText("")
            edtime2.setText("")
            edphone2.setText("")
            edtype2.setText("")
            ednamepet2.setText("")
            edtsex2.setText("")
            edcom2.setText("")
        }

        save2!!.setOnClickListener {
            val de1 = day2.text.toString()
            val de2 = edtime2.text.toString()
            val de3 = edphone2.text.toString()
            val de4 = edtype2.text.toString()
            val de5 = ednamepet2.text.toString()
            val de6 = edtsex2.text.toString()
            val de7 = edcom2.text.toString()
            if (TextUtils.isEmpty(de1) || TextUtils.isEmpty(de2.toString()) || TextUtils.isEmpty(de3.toString()) || TextUtils.isEmpty(de4.toString()) || TextUtils.isEmpty(de5.toString()) || TextUtils.isEmpty(de6.toString()) || TextUtils.isEmpty(de7.toString())) {
                Toast.makeText(this,"Wrong Information", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Add In formation", Toast.LENGTH_SHORT).show()
                val dataIntent2 = Intent(this, Confirm2::class.java)
                dataIntent2.putExtra("Date",day2.text.toString())
                dataIntent2.putExtra("Time",edtime2.text.toString())
                dataIntent2.putExtra("PhoneNumber",edphone2.text.toString())
                dataIntent2.putExtra("Type",edtype2.text.toString())
                dataIntent2.putExtra("NamePet",ednamepet2.text.toString())
                dataIntent2.putExtra("Comment",edcom2.text.toString())
                startActivity(dataIntent2)
            }
        }
    }
}