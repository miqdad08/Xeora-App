package com.miqdad.xeoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.miqdad.xeoraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        

        // 1. Declare and initialize a BottomNavigationView from your layout using data binding.
        val navView: BottomNavigationView = binding.navView

        // 2. Obtain the NavController for navigating between fragments in your activity.
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        
        // 3. Create an AppBarConfiguration to define the top-level destinations in your navigation graph.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home_fragment, // Specify the home fragment as a top-level destination.
                R.id.news_fragment  // Specify the news fragment as a top-level destination.
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
