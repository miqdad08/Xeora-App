package com.miqdad.xeoraapp.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.R

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgArtikel: ImageView = view.findViewById(R.id.img_artikel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_item_artikel, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgArtikel.setImageResource(listArtikel[position].imageArtikel)
    }

    override fun getItemCount(): Int {
        return listArtikel.size
    }
}