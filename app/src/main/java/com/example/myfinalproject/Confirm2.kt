package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_confirm2.*

class Confirm2 : AppCompatActivity() {

    var Condate22: TextView? = null
    var Contime22: TextView? = null
    var Conphonenumber22: TextView? = null
    var Contype22: TextView? = null
    var Connamepet22: TextView? = null
    var Concomment22: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm2)

        Condate22 = findViewById(R.id.condate22)
        Contime22 = findViewById(R.id.contime22)
        Conphonenumber22 = findViewById(R.id.conphonenumber22)
        Contype22 = findViewById(R.id.contype22)
        Connamepet22 = findViewById(R.id.connamepet22)
        Concomment22 = findViewById(R.id.concomment22)

        var intent = intent

        Condate22!!.text = intent.getStringExtra("Date")
        Contime22!!.text = intent.getStringExtra("Time")
        Conphonenumber22!!.text = intent.getStringExtra("PhoneNumber")
        Contype22!!.text = intent.getStringExtra("Type")
        Connamepet22!!.text = intent.getStringExtra("NamePet")
        Concomment22!!.text = intent.getStringExtra("Comment")

        confirm2.setOnClickListener {
            val dashiki2 = Intent(this, Success::class.java)
            startActivity(dashiki2)
        }
    }
}