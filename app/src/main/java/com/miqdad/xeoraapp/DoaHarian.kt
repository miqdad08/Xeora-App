package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.data.DataDzikirDoa
import com.miqdad.xeoraapp.data.DzikirAdapter

class DoaHarian : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        supportActionBar?.hide()

        val rvDoaHarian: RecyclerView = findViewById(R.id.rv_doa_harian)
        rvDoaHarian.layoutManager = LinearLayoutManager(this)
        rvDoaHarian.adapter = DzikirAdapter(DataDzikirDoa.listDoa)

        val imgBtnDoa: ImageButton = findViewById(R.id.img_btn_back_doa)
        imgBtnDoa.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.img_btn_back_doa -> startActivity(
                Intent(
                    this, MainActivity::class.java
                )
            )
        }
    }
}
