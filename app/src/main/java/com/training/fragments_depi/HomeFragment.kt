package com.training.fragments_depi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.training.fragments_depi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }



    fun setAdapter() {
        val foodList = listOf(
            Food(R.drawable.burger, "Burger"),
            Food(R.drawable.pizza, "Pizza"),
            Food(R.drawable.shawerma, "Shawerma"),
            Food(R.drawable.pancakes, "Pancakes"),
            Food(R.drawable.filletsteak, "Fillet Steak"),
            Food(R.drawable.waffles, "Waffles")
        )
        val recyclerViewAdapter = FoodAdapter(foodList)
        binding.rvMenu.layoutManager = GridLayoutManager(this.requireContext(), 2)
        binding.rvMenu.adapter = recyclerViewAdapter
    }
}
