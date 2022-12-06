package com.bignerdranch.android.cinema

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

    }

    fun but1(view: View) {
        var intent = Intent(this,CollectionAcrivity::class.java)
//            intent.putExtra("pas", pas1.text.toString())
//            intent.putExtra("log",log1.text.toString())

        startActivity(intent)
    }
}