package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_confirm.*
import kotlinx.android.synthetic.main.activity_confirm2.*
import kotlinx.android.synthetic.main.activity_service1.*
import kotlinx.android.synthetic.main.activity_service2.*

class Confirm : AppCompatActivity() {

    var Condate11: TextView? = null
    var Contime11: TextView? = null
    var Conphonenumber11: TextView? = null
    var Contype11: TextView? = null
    var Connamepet11: TextView? = null
    var Concomment11: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        Condate11 = findViewById(R.id.Condate11)
        Contime11 = findViewById(R.id.Contime11)
        Conphonenumber11 = findViewById(R.id.Conphonenumber11)
        Contype11 = findViewById(R.id.Contype11)
        Connamepet11 = findViewById(R.id.Connamepet11)
        Concomment11 = findViewById(R.id.Concomment11)

        var intent = intent

        Condate11!!.text = intent.getStringExtra("Date")
        Contime11!!.text = intent.getStringExtra("Time")
        Conphonenumber11!!.text = intent.getStringExtra("PhoneNumber")
        Contype11!!.text = intent.getStringExtra("Type")
        Connamepet11!!.text = intent.getStringExtra("NamePet")
        Concomment11!!.text = intent.getStringExtra("Comment")

        confirm1!!.setOnClickListener {
            val dashiki = Intent(this, Success::class.java)
            startActivity(dashiki)
        }
    }
}

