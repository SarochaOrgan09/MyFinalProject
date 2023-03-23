package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information1.*
import kotlinx.android.synthetic.main.activity_main.*

class Information1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information1)

        go1.setOnClickListener {
            val intent = Intent(this, Service1::class.java)
            startActivity(intent)
        }

        next.setOnClickListener {
            val intent = Intent(this, Information2::class.java)
            startActivity(intent)
        }

        logout1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}