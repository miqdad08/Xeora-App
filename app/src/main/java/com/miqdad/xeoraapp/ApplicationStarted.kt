package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView

class ApplicationStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_application_started)

        val cvDzikir: CardView = findViewById(R.id.cv_start)
        cvDzikir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Selamat Datang", Toast.LENGTH_SHORT).show()
        }
    }
}