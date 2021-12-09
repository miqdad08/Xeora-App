package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.data.DzikirAdapter

class DzikirPagi : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)
        supportActionBar?.hide()

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirAdapter(DataDzikirDoa.listDzikirPagi)

        val imgBtnpg : ImageButton = findViewById(R.id.img_btn_back_pg)
        imgBtnpg.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.img_btn_back_pg -> startActivity(
                Intent(
                this, DzikirActivity::class.java)
            )

        }
    }


}