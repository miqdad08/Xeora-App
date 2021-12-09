package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.miqdad.xeoraapp.data.DzikirPetang

class DzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir)
        supportActionBar?.hide()

        val cvDzikirPagi:CardView = findViewById(R.id.cv_dzikir_pg)
        cvDzikirPagi.setOnClickListener(this)
        val cvDzikirPetang : CardView = findViewById(R.id.cv_dzikir_ptg)
        cvDzikirPetang.setOnClickListener(this)
        val cvDzikir : CardView = findViewById(R.id.cv_sunnah_dzikir)
        cvDzikir.setOnClickListener(this)

        val imgBtn : ImageButton = findViewById(R.id.img_btn_back)
        imgBtn.setOnClickListener(this)




    }



    override fun onClick(v: View?) {
        when(v?.id){
            R.id.cv_dzikir_pg -> startActivity(Intent(
                    this, DzikirPagi::class.java))
            R.id.cv_dzikir_ptg -> startActivity(Intent(
                this, DzikirPetang::class.java
            ))
            R.id.cv_sunnah_dzikir -> startActivity(Intent(
                this, SunnahQauliyah::class.java
            ))
            R.id.img_btn_back -> startActivity(Intent(
                this, MainActivity::class.java))
        }

    }


}