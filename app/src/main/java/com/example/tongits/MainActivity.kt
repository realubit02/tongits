package com.example.tongits

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tongits.R.layout.*


class MainActivity : AppCompatActivity() {

    private lateinit var decks: ImageView
    private lateinit var p1card1: ImageView
    private lateinit var p1card2: ImageView
    private lateinit var p1card3: ImageView
    private lateinit var p1card4: ImageView
    private lateinit var p1card5: ImageView
    private lateinit var p1card6: ImageView
    private lateinit var p1card7: ImageView
    private lateinit var p1card8: ImageView
    private lateinit var p1card9: ImageView
    private lateinit var p1card10: ImageView
    private lateinit var p1card11: ImageView
    private lateinit var p1card12: ImageView
    private lateinit var p1card13: ImageView

    private lateinit var p2card1: ImageView
    private lateinit var p2card2: ImageView
    private lateinit var p2card3: ImageView
    private lateinit var p2card4: ImageView
    private lateinit var p2card5: ImageView
    private lateinit var p2card6: ImageView
    private lateinit var p2card7: ImageView
    private lateinit var p2card8: ImageView
    private lateinit var p2card9: ImageView
    private lateinit var p2card10: ImageView
    private lateinit var p2card11: ImageView
    private lateinit var p2card12: ImageView
    private lateinit var p2card13: ImageView

    private lateinit var p3card1: ImageView
    private lateinit var p3card2: ImageView
    private lateinit var p3card3: ImageView
    private lateinit var p3card4: ImageView
    private lateinit var p3card5: ImageView
    private lateinit var p3card6: ImageView
    private lateinit var p3card7: ImageView
    private lateinit var p3card8: ImageView
    private lateinit var p3card9: ImageView
    private lateinit var p3card10: ImageView
    private lateinit var p3card11: ImageView
    private lateinit var p3card12: ImageView
    private lateinit var p3card13: ImageView

    private lateinit var p4card1: ImageView
    private lateinit var p4card2: ImageView
    private lateinit var p4card3: ImageView
    private lateinit var p4card4: ImageView
    private lateinit var p4card5: ImageView
    private lateinit var p4card6: ImageView
    private lateinit var p4card7: ImageView
    private lateinit var p4card8: ImageView
    private lateinit var p4card9: ImageView
    private lateinit var p4card10: ImageView
    private lateinit var p4card11: ImageView
    private lateinit var p4card12: ImageView
    private lateinit var p4card13: ImageView

    private lateinit var cards: ArrayList<Int>
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        setContentView(activity_main)

        //animation()
        //rotate ()

        decks = findViewById(R.id.deck)
        p1card1 = findViewById(R.id.p1card1)
        p1card2 = findViewById(R.id.p1card2)
        p1card3 = findViewById(R.id.p1card3)
        p1card4 = findViewById(R.id.p1card4)
        p1card5 = findViewById(R.id.p1card5)
        p1card6 = findViewById(R.id.p1card6)
        p1card7 = findViewById(R.id.p1card7)
        p1card8 = findViewById(R.id.p1card8)
        p1card9 = findViewById(R.id.p1card9)
        p1card10 = findViewById(R.id.p1card10)
        p1card11 = findViewById(R.id.p1card11)
        p1card12 = findViewById(R.id.p1card12)
        p1card13 = findViewById(R.id.p1card13)

        p1card1.visibility = View.INVISIBLE
        p1card2.visibility = View.INVISIBLE
        p1card3.visibility = View.INVISIBLE
        p1card4.visibility = View.INVISIBLE
        p1card5.visibility = View.INVISIBLE
        p1card6.visibility = View.INVISIBLE
        p1card7.visibility = View.INVISIBLE
        p1card8.visibility = View.INVISIBLE
        p1card9.visibility = View.INVISIBLE
        p1card10.visibility = View.INVISIBLE
        p1card11.visibility = View.INVISIBLE
        p1card12.visibility = View.INVISIBLE
        p1card13.visibility = View.INVISIBLE

        p2card1 = findViewById(R.id.p2card1)
        p2card2 = findViewById(R.id.p2card2)
        p2card3 = findViewById(R.id.p2card3)
        p2card4 = findViewById(R.id.p2card4)
        p2card5 = findViewById(R.id.p2card5)
        p2card6 = findViewById(R.id.p2card6)
        p2card7 = findViewById(R.id.p2card7)
        p2card8 = findViewById(R.id.p2card8)
        p2card9 = findViewById(R.id.p2card9)
        p2card10 = findViewById(R.id.p2card10)
        p2card11 = findViewById(R.id.p2card11)
        p2card12 = findViewById(R.id.p2card12)
        p2card13 = findViewById(R.id.p2card13)

        p2card1.visibility = View.INVISIBLE
        p2card2.visibility = View.INVISIBLE
        p2card3.visibility = View.INVISIBLE
        p2card4.visibility = View.INVISIBLE
        p2card5.visibility = View.INVISIBLE
        p2card6.visibility = View.INVISIBLE
        p2card7.visibility = View.INVISIBLE
        p2card8.visibility = View.INVISIBLE
        p2card9.visibility = View.INVISIBLE
        p2card10.visibility = View.INVISIBLE
        p2card11.visibility = View.INVISIBLE
        p2card12.visibility = View.INVISIBLE
        p2card13.visibility = View.INVISIBLE

        p3card1 = findViewById(R.id.p3card1)
        p3card2 = findViewById(R.id.p3card2)
        p3card3 = findViewById(R.id.p3card3)
        p3card4 = findViewById(R.id.p3card4)
        p3card5 = findViewById(R.id.p3card5)
        p3card6 = findViewById(R.id.p3card6)
        p3card7 = findViewById(R.id.p3card7)
        p3card8 = findViewById(R.id.p3card8)
        p3card9 = findViewById(R.id.p3card9)
        p3card10 = findViewById(R.id.p3card10)
        p3card11 = findViewById(R.id.p3card11)
        p3card12 = findViewById(R.id.p3card12)
        p3card13 = findViewById(R.id.p3card13)

        p3card1.visibility = View.INVISIBLE
        p3card2.visibility = View.INVISIBLE
        p3card3.visibility = View.INVISIBLE
        p3card4.visibility = View.INVISIBLE
        p3card5.visibility = View.INVISIBLE
        p3card6.visibility = View.INVISIBLE
        p3card7.visibility = View.INVISIBLE
        p3card8.visibility = View.INVISIBLE
        p3card9.visibility = View.INVISIBLE
        p3card10.visibility = View.INVISIBLE
        p3card11.visibility = View.INVISIBLE
        p3card12.visibility = View.INVISIBLE
        p3card13.visibility = View.INVISIBLE

        p4card1 = findViewById(R.id.p4card1)
        p4card2 = findViewById(R.id.p4card2)
        p4card3 = findViewById(R.id.p4card3)
        p4card4 = findViewById(R.id.p4card4)
        p4card5 = findViewById(R.id.p4card5)
        p4card6 = findViewById(R.id.p4card6)
        p4card7 = findViewById(R.id.p4card7)
        p4card8 = findViewById(R.id.p4card8)
        p4card9 = findViewById(R.id.p4card9)
        p4card10 = findViewById(R.id.p4card10)
        p4card11 = findViewById(R.id.p4card11)
        p4card12 = findViewById(R.id.p4card12)
        p4card13 = findViewById(R.id.p4card13)

        p4card1.visibility = View.INVISIBLE
        p4card2.visibility = View.INVISIBLE
        p4card3.visibility = View.INVISIBLE
        p4card4.visibility = View.INVISIBLE
        p4card5.visibility = View.INVISIBLE
        p4card6.visibility = View.INVISIBLE
        p4card7.visibility = View.INVISIBLE
        p4card8.visibility = View.INVISIBLE
        p4card9.visibility = View.INVISIBLE
        p4card10.visibility = View.INVISIBLE
        p4card11.visibility = View.INVISIBLE
        p4card12.visibility = View.INVISIBLE
        p4card13.visibility = View.INVISIBLE

        val deck = ArrayList<Int>()

        deck.add(101) // ace spades
        deck.add(102) // 2 of spades
        deck.add(103) // 3 of spades
        deck.add(104) // 4 of spades
        deck.add(105) // 5 of spades
        deck.add(106) // 6 of spades
        deck.add(107) // 7 of spades
        deck.add(108) // 8 of spades
        deck.add(109) // 9 of spades
        deck.add(110) // 10 of spades
        deck.add(111) // 11 of spades
        deck.add(112) // 12 of spades
        deck.add(113) // 13 of spades

        deck.add(201) // ace hearts
        deck.add(202) // 2 of hearts
        deck.add(203) // 3 of hearts
        deck.add(204) // 4 of hearts
        deck.add(205) // 5 of hearts
        deck.add(206) // 6 of hearts
        deck.add(207) // 7 of hearts
        deck.add(208) // 8 of hearts
        deck.add(209) // 9 of hearts
        deck.add(210) // 10 of hearts
        deck.add(211) // 11 of hearts
        deck.add(212) // 12 of hearts
        deck.add(213) // 13 of hearts

        deck.add(301) // ace clubs
        deck.add(302) // 2 of clubs
        deck.add(303) // 3 of clubs
        deck.add(304) // 4 of clubs
        deck.add(305) // 5 of clubs
        deck.add(306) // 6 of clubs
        deck.add(307) // 7 of clubs
        deck.add(308) // 8 of clubs
        deck.add(309) // 9 of clubs
        deck.add(310) // 10 of clubs
        deck.add(311) // 11 of clubs
        deck.add(312) // 12 of clubs
        deck.add(313) // 13 of clubs

        deck.add(401) // ace diamonds
        deck.add(402) // 2 of diamonds
        deck.add(403) // 3 of diamonds
        deck.add(404) // 4 of diamonds
        deck.add(405) // 5 of diamonds
        deck.add(406) // 6 of diamonds
        deck.add(407) // 7 of diamonds
        deck.add(408) // 8 of diamonds
        deck.add(409) // 9 of diamonds
        deck.add(410) // 10 of diamonds
        deck.add(411) // 11 of diamonds
        deck.add(412) // 12 of diamonds
        deck.add(413) // 13 of diamonds

        val distribute = findViewById<Button>(R.id.bounce)
        distribute.setOnClickListener(){
        rotate()
        deck.shuffle()
//            val animationBounce = AnimationUtils.loadAnimation(this, layout.rotate)
//            decks.startAnimation(animationBounce)
            //decks.visibility = INVISIBLE


            assignImage(deck[0], p1card1)
            assignImage(deck[1], p1card2)
            assignImage(deck[2], p1card3)
            assignImage(deck[3], p1card4)
            assignImage(deck[4], p1card5)
            assignImage(deck[5], p1card6)
            assignImage(deck[6], p1card7)
            assignImage(deck[7], p1card8)
            assignImage(deck[8], p1card9)
            assignImage(deck[9], p1card10)
            assignImage(deck[10], p1card11)
            assignImage(deck[11], p1card12)
            assignImage(deck[12], p1card13)
            if(deck.contains(0)) {


            p1card1.visibility = View.VISIBLE
            p1card2.visibility = View.VISIBLE
            p1card3.visibility = View.VISIBLE
            p1card4.visibility = View.VISIBLE
            p1card5.visibility = View.VISIBLE
            p1card6.visibility = View.VISIBLE
            p1card7.visibility = View.VISIBLE
            p1card8.visibility = View.VISIBLE
            p1card9.visibility = View.VISIBLE
            p1card10.visibility = View.VISIBLE
            p1card11.visibility = View.VISIBLE
            p1card12.visibility = View.VISIBLE
            p1card13.visibility = View.VISIBLE
        }
        }
//            assignImage(deck[13], p2card1)
//            assignImage(deck[14], p2card2)
//            assignImage(deck[15], p2card3)
//            assignImage(deck[16], p2card4)
//            assignImage(deck[17], p2card5)
//            assignImage(deck[18], p2card6)
//            assignImage(deck[19], p2card7)
//            assignImage(deck[20], p2card8)
//            assignImage(deck[21], p2card9)
//            assignImage(deck[22], p2card10)
//            assignImage(deck[23], p2card11)
//            assignImage(deck[24], p2card12)
//            assignImage(deck[25], p2card13)
//
//
//            p2card1.visibility = View.VISIBLE
//            p2card2.visibility = View.VISIBLE
//            p2card3.visibility = View.VISIBLE
//            p2card4.visibility = View.VISIBLE
//            p2card5.visibility = View.VISIBLE
//            p2card6.visibility = View.VISIBLE
//            p2card7.visibility = View.VISIBLE
//            p2card8.visibility = View.VISIBLE
//            p2card9.visibility = View.VISIBLE
//            p2card10.visibility = View.VISIBLE
//            p2card11.visibility = View.VISIBLE
//            p2card12.visibility = View.VISIBLE
//            p2card13.visibility = View.VISIBLE
//
//            assignImage(deck[26], p3card1)
//            assignImage(deck[27], p3card2)
//            assignImage(deck[28], p3card3)
//            assignImage(deck[29], p3card4)
//            assignImage(deck[30], p3card5)
//            assignImage(deck[31], p3card6)
//            assignImage(deck[32], p3card7)
//            assignImage(deck[33], p3card8)
//            assignImage(deck[34], p3card9)
//            assignImage(deck[35], p3card10)
//            assignImage(deck[36], p3card11)
//            assignImage(deck[37], p3card12)
//            assignImage(deck[38], p3card13)
//
//            p3card1.visibility = View.VISIBLE
//            p3card2.visibility = View.VISIBLE
//            p3card3.visibility = View.VISIBLE
//            p3card4.visibility = View.VISIBLE
//            p3card5.visibility = View.VISIBLE
//            p3card6.visibility = View.VISIBLE
//            p3card7.visibility = View.VISIBLE
//            p3card8.visibility = View.VISIBLE
//            p3card9.visibility = View.VISIBLE
//            p3card10.visibility = View.VISIBLE
//            p3card11.visibility = View.VISIBLE
//            p3card12.visibility = View.VISIBLE
//            p3card13.visibility = View.VISIBLE
//
//
//            assignImage(deck[39], p4card1)
//            assignImage(deck[40], p4card2)
//            assignImage(deck[41], p4card3)
//            assignImage(deck[42], p4card4)
//            assignImage(deck[43], p4card5)
//            assignImage(deck[44], p4card6)
//            assignImage(deck[45], p4card7)
//            assignImage(deck[46], p4card8)
//            assignImage(deck[47], p4card9)
//            assignImage(deck[48], p4card10)
//            assignImage(deck[49], p4card11)
//            assignImage(deck[50], p4card12)
//            assignImage(deck[51], p4card13)
//
//            p4card1.visibility = View.VISIBLE
//            p4card2.visibility = View.VISIBLE
//            p4card3.visibility = View.VISIBLE
//            p4card4.visibility = View.VISIBLE
//            p4card5.visibility = View.VISIBLE
//            p4card6.visibility = View.VISIBLE
//            p4card7.visibility = View.VISIBLE
//            p4card8.visibility = View.VISIBLE
//            p4card9.visibility = View.VISIBLE
//            p4card10.visibility = View.VISIBLE
//            p4card11.visibility = View.VISIBLE
//            p4card12.visibility = View.VISIBLE
//            p4card13.visibility = View.VISIBLE
//
//            decks.visibility = INVISIBLE
//
//
//
//

        }


    fun assignImage (deck :Int, imageView: ImageView) {
        when (deck) {
            101 -> {
                imageView.setImageResource(R.drawable.clubs_1)
            }

            102 -> {
                imageView.setImageResource(R.drawable.clubs_2)
            }

            103 -> {
                imageView.setImageResource(R.drawable.clubs_3)
            }

            104 -> {
                imageView.setImageResource(R.drawable.clubs_4)
            }

            105 -> {
                imageView.setImageResource(R.drawable.clubs_5)
            }

            106 -> {
                imageView.setImageResource(R.drawable.clubs_6)
            }

            107 -> {
                imageView.setImageResource(R.drawable.clubs_7)
            }

            108 -> {
                imageView.setImageResource(R.drawable.clubs_8)
            }

            109 -> {
                imageView.setImageResource(R.drawable.clubs_9)
            }

            110 -> {
                imageView.setImageResource(R.drawable.clubs_10)
            }

            111 -> {
                imageView.setImageResource(R.drawable.clubs_11)
            }

            112 -> {
                imageView.setImageResource(R.drawable.clubs_12)
            }

            113 -> {
                imageView.setImageResource(R.drawable.clubs_13)
            }

            201 -> {
                imageView.setImageResource(R.drawable.hearts_1)
            }

            202 -> {
                imageView.setImageResource(R.drawable.hearts_2)
            }

            203 -> {
                imageView.setImageResource(R.drawable.hearts_3)
            }

            204 -> {
                imageView.setImageResource(R.drawable.hearts_4)
            }

            205 -> {
                imageView.setImageResource(R.drawable.hearts_5)
            }

            206 -> {
                imageView.setImageResource(R.drawable.hearts_6)
            }

            207 -> {
                imageView.setImageResource(R.drawable.hearts_7)
            }

            208 -> {
                imageView.setImageResource(R.drawable.hearts_8)
            }

            209 -> {
                imageView.setImageResource(R.drawable.hearts_9)
            }

            210 -> {
                imageView.setImageResource(R.drawable.hearts_10)
            }

            211 -> {
                imageView.setImageResource(R.drawable.hearts_11)
            }

            212 -> {
                imageView.setImageResource(R.drawable.hearts_12)
            }

            213 -> {
                imageView.setImageResource(R.drawable.hearts_13)
            }


            301 -> {
                imageView.setImageResource(R.drawable.diamonds_1)
            }

            302 -> {
                imageView.setImageResource(R.drawable.diamonds_2)
            }

            303 -> {
                imageView.setImageResource(R.drawable.diamonds_3)
            }

            304 -> {
                imageView.setImageResource(R.drawable.diamonds_4)
            }

            305 -> {
                imageView.setImageResource(R.drawable.diamonds_5)
            }

            306 -> {
                imageView.setImageResource(R.drawable.diamonds_6)
            }

            307 -> {
                imageView.setImageResource(R.drawable.diamonds_7)
            }

            308 -> {
                imageView.setImageResource(R.drawable.diamonds_8)
            }

            309 -> {
                imageView.setImageResource(R.drawable.diamonds_9)
            }

            310 -> {
                imageView.setImageResource(R.drawable.diamonds_10)
            }

            311 -> {
                imageView.setImageResource(R.drawable.diamonds_11)
            }

            312 -> {
                imageView.setImageResource(R.drawable.diamonds_12)
            }

            313 -> {
                imageView.setImageResource(R.drawable.diamonds_13)
            }


            401 -> {
                imageView.setImageResource(R.drawable.spades_1)
            }

            402 -> {
                imageView.setImageResource(R.drawable.spades_2)
            }

            403 -> {
                imageView.setImageResource(R.drawable.spades_3)
            }

            404 -> {
                imageView.setImageResource(R.drawable.spades_4)
            }

            405 -> {
                imageView.setImageResource(R.drawable.spades_5)
            }

            406 -> {
                imageView.setImageResource(R.drawable.spades_6)
            }

            407 -> {
                imageView.setImageResource(R.drawable.spades_7)
            }

            408 -> {
                imageView.setImageResource(R.drawable.spades_8)
            }

            409 -> {
                imageView.setImageResource(R.drawable.spades_9)
            }

            410 -> {
                imageView.setImageResource(R.drawable.spades_10)
            }

            411 -> {
                imageView.setImageResource(R.drawable.spades_11)
            }

            412 -> {
                imageView.setImageResource(R.drawable.spades_12)
            }

            413 -> {
                imageView.setImageResource(R.drawable.spades_13)
            }

        }
    }


    @SuppressLint("ResourceType")
    fun rotate () {
        decks.animate()

            .rotationBy(360f)
            .start()
        val flipAnimation = AnimationUtils.loadAnimation(this, R.layout.rotate)

        decks.startAnimation(flipAnimation)
        flipView(decks)
//        if (flipAnimation.hasEnded()) {
//
//
//
//        }
//       decks.visibility= INVISIBLE
    }
    private fun flipView(view: View) {
        // Create two ObjectAnimators for rotationY, one for the front side, and one for the back side
        val animator1 = ObjectAnimator.ofFloat(view, "rotationY", 0f, 90f)
        val animator2 = ObjectAnimator.ofFloat(view, "rotationY", -90f, 0f)

        // Set the duration of each animator (milliseconds)
        animator1.duration = 500
        animator2.duration = 500

        // Add a listener to change the visibility of the view when halfway through the animation
        animator1.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                view.visibility = View.INVISIBLE
                animator2.start()
            }
        })

        // Start the first animator
        animator1.start()
    }

}