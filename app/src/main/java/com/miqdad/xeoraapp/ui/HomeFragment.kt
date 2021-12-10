package com.miqdad.xeoraapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.card.MaterialCardView
import com.miqdad.xeoraapp.*
import com.miqdad.xeoraapp.data.Artikel
import com.miqdad.xeoraapp.data.ArtikelAdapter
import com.miqdad.xeoraapp.data.DataArtikel
import com.miqdad.xeoraapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private var _binding :FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        binding.rvArtikel.apply {
            setHasFixedSize(true)

            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            layoutManager = layoutManager
            adapter = ArtikelAdapter(DataArtikel.listArtikel)
        }


        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgTasbih: CardView = view.findViewById(R.id.img_tasbih)
        imgTasbih.setOnClickListener {
            val intent = Intent(activity, DzikirActivity::class.java)
            startActivity(intent)
        }

        val imgQuran: CardView = view.findViewById(R.id.img_quran)
        imgQuran.setOnClickListener {
            val intent = Intent(activity, HadistActivity::class.java)
            startActivity(intent)
        }

        val imgDoa: CardView = view.findViewById(R.id.img_doa)
        imgDoa.setOnClickListener {
            val intent = Intent(activity, DoaHarian::class.java)
            startActivity(intent)
        }


        binding.cvArtikel.setOnClickListener {
            val intent = Intent(activity, DetailArtikelActivity::class.java)
            intent.putExtra(DetailArtikelActivity.DATA_TITLE, DataArtikel.titleDetailArtikel[1])
            intent.putExtra(DetailArtikelActivity.DATA_DESC, DataArtikel.descDetailArtikel[1])
            intent.putExtra(DetailArtikelActivity.DATA_IMAGE, DataArtikel.imageDetailArtikel[1])
            startActivity(intent)
        }

    }



}