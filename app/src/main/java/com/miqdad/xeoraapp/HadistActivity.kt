package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.data.DzikirAdapter
import com.miqdad.xeoraapp.ui.HomeFragment

class HadistActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadist)
        supportActionBar?.hide()

        val rvHadist: RecyclerView = findViewById(R.id.rv_hadist)
        rvHadist.layoutManager = LinearLayoutManager(this)
        rvHadist.adapter = DzikirAdapter(DataDzikirDoa.listHadist)

        val imgBtnHadist : ImageButton = findViewById(R.id.img_btn_back_hadist)
        imgBtnHadist.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.img_btn_back_hadist -> startActivity(
                Intent(
                    this, MainActivity::class.java)
            )
        }
    }


}