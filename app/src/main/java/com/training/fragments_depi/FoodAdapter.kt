package com.training.fragments_depi

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.training.fragments_depi.databinding.FoodItemBinding


class FoodAdapter(val list: List<Food>) : RecyclerView.Adapter<FoodAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: FoodItemBinding) : RecyclerView.ViewHolder(binding.root) {
        companion object{
            fun from(parent: ViewGroup):MyViewHolder{
                val layoutInflater= LayoutInflater.from(parent.context)
                val binding=FoodItemBinding.inflate(layoutInflater,parent,false)
                return MyViewHolder(binding)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //no memory leaks i think
        val context=holder.itemView.context
       val foodItem = list[position]
        holder.binding.food=foodItem
        Log.d("FoodAdapter", "position: $position")
        holder.itemView.setOnClickListener{
            val intent= Intent(context,FoodDetailsActivity::class.java).apply {
                putExtra("foodName",foodItem.foodName)
                putExtra("foodImg",foodItem.Foodimg)
            }
            context.startActivity(intent)
        }


    }

    override fun getItemCount() = list.size


}
