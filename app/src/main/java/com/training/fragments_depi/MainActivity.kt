package com.training.fragments_depi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupWithNavController
import com.training.fragments_depi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityBinding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHost.navController

        setupWithNavController(activityBinding.bottomNavigation, navController)

        activityBinding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.navigation_search->{
                    navController.navigate(R.id.navigation_home)
                    true
                }
                R.id.navigation_cart->{
                    navController.navigate(R.id.navigation_cart)
                    true
                }
                R.id.navigation_plans->{
                    navController.navigate(R.id.navigation_meal)
                    true
                }

                else -> {false}
            }
        }


    }

}