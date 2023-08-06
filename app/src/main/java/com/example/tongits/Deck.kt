package com.example.tongits



class Deck {
    private val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    private val suits = listOf("Hearts", "Diamonds", "Clubs", "Spades")
    private val cards = mutableListOf<Card>()

    init {
        // Initialize the deck with all cards
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
    }

    fun display() {
        for (card in cards) {
            println(card)
        }
    }
}
