package com.training.fragments_depi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.training.fragments_depi.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFoodDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val foodName = intent.getStringExtra("foodName")
        val foodImg = intent.getIntExtra("foodImg", 0)

        val food=Food(foodImg,foodName!!)
        binding.food=food

    }

}