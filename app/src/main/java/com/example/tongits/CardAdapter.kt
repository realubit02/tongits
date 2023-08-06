package com.example.tongits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class CardAdapter(private val itemCount: Int) : RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.deck2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card_tongits, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageResId = R.drawable.back_of_deck // Replace with your actual image resource ID
        holder.imageView.setImageResource(imageResId)
    }

    override fun getItemCount(): Int {
        return itemCount
    }
}
