package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_information1.*
import kotlinx.android.synthetic.main.activity_service1.*

class Service1 : AppCompatActivity() {

    private lateinit var day1: EditText
    private lateinit var edtime1: EditText
    private lateinit var edphone1: EditText
    private lateinit var edtype1: EditText
    private lateinit var ednamepet1: EditText
    private lateinit var edtsex1: EditText
    private lateinit var edcom1: EditText

    private lateinit var bttsave1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service1)

        var intent = intent

        day1 = findViewById<EditText>(R.id.day11)
        edtime1 = findViewById<EditText>(R.id.time11)
        edphone1 = findViewById<EditText>(R.id.phonenumber11)
        edtype1 = findViewById<EditText>(R.id.type11)
        ednamepet1 = findViewById<EditText>(R.id.namepet11)
        edtsex1 = findViewById<EditText>(R.id.sex11)
        edcom1 = findViewById<EditText>(R.id.comment11)

        bttsave1 = findViewById<Button>(R.id.save1)

        clear!!.setOnClickListener {
            day1.setText("")
            edtime1.setText("")
            edphone1.setText("")
            edtype1.setText("")
            ednamepet1.setText("")
            edtsex1.setText("")
            edcom1.setText("")
        }

        save1!!.setOnClickListener {
            val de1 = day1.text.toString()
            val de2 = edtime1.text.toString()
            val de3 = edphone1.text.toString()
            val de4 = edtype1.text.toString()
            val de5 = ednamepet1.text.toString()
            val de6 = edtsex1.text.toString()
            val de7 = edcom1.text.toString()
            if (TextUtils.isEmpty(de1) || TextUtils.isEmpty(de2.toString()) || TextUtils.isEmpty(de3.toString()) || TextUtils.isEmpty(de4.toString()) || TextUtils.isEmpty(de5.toString()) || TextUtils.isEmpty(de6.toString()) || TextUtils.isEmpty(de7.toString())) {
                Toast.makeText(this,"Wrong Information", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Add In formation", Toast.LENGTH_SHORT).show()
                val dataIntent = Intent(this, Confirm::class.java)
                dataIntent.putExtra("Date",day1.text.toString())
                dataIntent.putExtra("Time",edtime1.text.toString())
                dataIntent.putExtra("PhoneNumber",edphone1.text.toString())
                dataIntent.putExtra("Type",edtype1.text.toString())
                dataIntent.putExtra("NamePet",ednamepet1.text.toString())
                dataIntent.putExtra("Comment",edcom1.text.toString())
                startActivity(dataIntent)
            }
        }
    }
}





