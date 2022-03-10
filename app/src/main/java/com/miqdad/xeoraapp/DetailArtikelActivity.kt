package com.miqdad.xeoraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.miqdad.xeoraapp.databinding.ActivityDetailArtikelBinding
import com.miqdad.xeoraapp.databinding.FragmentNewsBinding

class DetailArtikelActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  binding: ActivityDetailArtikelBinding

    companion object{
        const val DATA_TITLE = "title"
        const val DATA_DESC = "data"
        const val DATA_IMAGE = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        var actionBar = supportActionBar

//        if (actionBar != null){
//            actionBar.setHomeAsUpIndicator(R.id.img_btn_back_detail)
//
//            actionBar.setDisplayHomeAsUpEnabled(true)
//        }

        setContentView(R.layout.activity_detail_artikel)

        title = "Artikel Islami"

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle: TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle

        val tvDesc: TextView = findViewById(R.id.tv_desc_detail)
        tvDesc.text = dataDesc
        val imgArtikel: ImageView = findViewById(R.id.img_detail)
        imgArtikel.setImageResource(dataImage)

        val imgBtn : ImageButton = findViewById(R.id.img_btn_back_detail)
        imgBtn.setOnClickListener(this)




    }

//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        when (item.itemId){
//            android.R
//        }
//    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.img_btn_back_detail -> startActivity(
                Intent(
                this, MainActivity::class.java)

            )
        }
    }
}