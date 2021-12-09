package com.miqdad.xeoraapp.data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.DataDzikirDoa
import com.miqdad.xeoraapp.DzikirActivity
import com.miqdad.xeoraapp.R

class DzikirPetang : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)
        supportActionBar?.hide()

        val rvDzikirPetang = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
        rvDzikirPetang.layoutManager = LinearLayoutManager(this)
        rvDzikirPetang.adapter = DzikirAdapter(DataDzikirDoa.listDzikirPetang)

        val imgBtnptg : ImageButton = findViewById(R.id.img_btn_back_ptg)
        imgBtnptg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.img_btn_back_ptg -> startActivity(
                Intent(
                    this, DzikirActivity::class.java)
            )

        }
    }

}