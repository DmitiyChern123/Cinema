package com.bignerdranch.android.cinema

import android.content.Intent

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var log: EditText
    lateinit var pas: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun but(view: View) {
        var log1 = findViewById<EditText>(R.id.logEnter)
        var pas1 = findViewById<EditText>(R.id.pasenter)
        if (log1.text.toString()!="" || pas1.text.toString()!=""){



            var intent = Intent(this,MenuActivity::class.java)
//            intent.putExtra("pas", pas1.text.toString())
//            intent.putExtra("log",log1.text.toString())

            startActivity(intent)
        }
    }
}