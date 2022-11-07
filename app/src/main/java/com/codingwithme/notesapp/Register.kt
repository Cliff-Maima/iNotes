package com.codingwithme.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Register : AppCompatActivity() {
    private lateinit var username_input: EditText
    private lateinit var email_input: EditText
    private lateinit var phone_input: EditText
    private lateinit var pass_input: EditText
    private lateinit var btn_create: Button
    private lateinit var btn_go: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
        username_input= findViewById(R.id.username)
        email_input= findViewById(R.id.email)
        phone_input= findViewById(R.id.phone)
        pass_input= findViewById(R.id.password)
        btn_create= findViewById(R.id.signup_btn)
        btn_go= findViewById(R.id.log_btn)

        btn_go.setOnClickListener {
            var registerintent = Intent(this,LogIn::class.java)
            startActivity(registerintent)
            finish()
            Toast.makeText(this,"LogIn Successful", Toast.LENGTH_SHORT).show()

        }
        btn_create.setOnClickListener {
            var registerintent = Intent(this,LogIn::class.java)
            startActivity(registerintent)
            finish()
            Toast.makeText(this,"Account Created Successfully", Toast.LENGTH_SHORT).show()

        }
    }
}