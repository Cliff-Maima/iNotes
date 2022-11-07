package com.codingwithme.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogIn : AppCompatActivity() {
    private lateinit var email_input: EditText
    private lateinit var pass_input: EditText
    private lateinit var btn_create: Button
    private lateinit var btn_go: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        supportActionBar?.hide()
        email_input= findViewById(R.id.email)
        pass_input= findViewById(R.id.password)
        btn_create= findViewById(R.id.login_btn)
        btn_go= findViewById(R.id.register_btn)

        btn_create.setOnClickListener {
            var loginintent = Intent(this,MainActivity::class.java)
            startActivity(loginintent)
            finish()

        }
        btn_go.setOnClickListener {
            var accountintent = Intent(this,Register::class.java)
            startActivity(accountintent)
            finish()
        }
    }
}