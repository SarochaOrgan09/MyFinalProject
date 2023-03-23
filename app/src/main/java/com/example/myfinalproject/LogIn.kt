package com.example.myfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LogIn : AppCompatActivity() {

    private lateinit var loginbtt: Button
    private lateinit var edituser: EditText
    private lateinit var editpword: EditText
    private lateinit var dbh: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        loginbtt = findViewById(R.id.login)
        edituser = findViewById(R.id.username2)
        editpword = findViewById(R.id.password2)
        dbh = DBHelper(this)

        loginbtt.setOnClickListener {
            val useredtx = edituser.text.toString()
            val passdtx = editpword.text.toString()
            if(TextUtils.isEmpty(useredtx) || TextUtils.isEmpty(passdtx)){
                Toast.makeText(this,"Add Username & Password", Toast.LENGTH_SHORT).show()
            }
            else {
                val checkuser = dbh.checkuserpass(useredtx, passdtx)
                if(checkuser==true){
                    Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext, Information1::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this,"Wrong Username & Password", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}