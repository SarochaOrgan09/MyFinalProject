package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information1.*
import kotlinx.android.synthetic.main.activity_information2.*

class Information2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information2)

        go2.setOnClickListener {
            val intent = Intent(this, Service2::class.java)
            startActivity(intent)
        }

        back.setOnClickListener {
            val intent = Intent(this, Information1::class.java)
            startActivity(intent)
        }

        logout2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}