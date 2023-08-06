package com.example.tongits
import androidx.room.Entity
import androidx.room.PrimaryKey


data class Card(val rank: String, val suit: String) {
    override fun toString(): String {
        return "$rank of $suit"
    }
}