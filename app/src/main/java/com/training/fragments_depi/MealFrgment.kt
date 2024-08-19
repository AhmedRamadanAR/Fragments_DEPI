package com.training.fragments_depi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.training.fragments_depi.databinding.FragmentMealFrgmentBinding

class MealFrgment : Fragment() {
    lateinit var binding: FragmentMealFrgmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealFrgmentBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment

        return binding.root
    }
}
