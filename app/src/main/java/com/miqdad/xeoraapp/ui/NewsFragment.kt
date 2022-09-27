package com.miqdad.xeoraapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miqdad.xeoraapp.DetailArtikelActivity
import com.miqdad.xeoraapp.data.DataArtikel
import com.miqdad.xeoraapp.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNewsBinding.inflate(inflater, container, false)

        binding.cvArtikel1.setOnClickListener {
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.DATA_TITLE, DataArtikel.titleDetailArtikel[0])
            intent.putExtra(DetailArtikelActivity.DATA_DESC, DataArtikel.descDetailArtikel[0])
            intent.putExtra(DetailArtikelActivity.DATA_IMAGE, DataArtikel.imageDetailArtikel[0])
            startActivity(intent)
        }

        binding.cvArtikel2.setOnClickListener {
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.DATA_TITLE, DataArtikel.titleDetailArtikel[1])
            intent.putExtra(DetailArtikelActivity.DATA_DESC, DataArtikel.descDetailArtikel[1])
            intent.putExtra(DetailArtikelActivity.DATA_IMAGE, DataArtikel.imageDetailArtikel[1])
            startActivity(intent)
        }

        binding.cvArtikel3.setOnClickListener {
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.DATA_TITLE, DataArtikel.titleDetailArtikel[2])
            intent.putExtra(DetailArtikelActivity.DATA_DESC, DataArtikel.descDetailArtikel[2])
            intent.putExtra(DetailArtikelActivity.DATA_IMAGE, DataArtikel.imageDetailArtikel[2])
            startActivity(intent)
        }

        binding.cvArtikel4.setOnClickListener {
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.DATA_TITLE, DataArtikel.titleDetailArtikel[3])
            intent.putExtra(DetailArtikelActivity.DATA_DESC, DataArtikel.descDetailArtikel[3])
            intent.putExtra(DetailArtikelActivity.DATA_IMAGE, DataArtikel.imageDetailArtikel[3])
            startActivity(intent)
        }
        return binding.root
    }
}