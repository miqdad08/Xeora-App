package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.data.DzikirAdapter

class SunnahQauliyah : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunnah_qauliyah)
        supportActionBar?.hide()

        val rvQauliyyah: RecyclerView = findViewById(R.id.rv_dzikir)
        rvQauliyyah.layoutManager = LinearLayoutManager(this)
        rvQauliyyah.adapter = DzikirAdapter(DataDzikirDoa.listDzikir)

        val imgBtndzikir: ImageButton = findViewById(R.id.img_btn_back_dzikir)
        imgBtndzikir.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.img_btn_back_dzikir -> startActivity(
                Intent(
                    this, DzikirActivity::class.java
                )
            )
        }
    }
}