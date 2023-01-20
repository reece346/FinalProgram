package com.example.finalprogram

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val myButton : Button = findViewById(R.id.loginButton)
        println(findViewById(R.id.textView2))
    }
    fun goToNext(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        val userEditText : EditText = findViewById(R.id.username)
        val usernameStr : String = userEditText.text.toString()
        // transfers username between activities
        intent.putExtra("userName", usernameStr)
        println(findViewById(R.id.textView))
        if(intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
        println(findViewById(R.id.textView))
    }
}