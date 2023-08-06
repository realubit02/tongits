package com.example.tongits

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
class CardAdapter(private val cards: List<Card>, private val onItemClick: (Card) -> Unit) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = cards[position]
       // holder.imageView.setImageResource(card.imageResource)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    inner class CardViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
  //  val imageView: ImageView = view.findViewById(R.id.imageViewCard)

    }
}
