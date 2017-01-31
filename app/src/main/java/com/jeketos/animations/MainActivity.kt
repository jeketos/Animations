package com.jeketos.animations

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background1 = ContextCompat.getDrawable(this, R.drawable.anim_trash)
        background1.setTint(ContextCompat.getColor(this, R.color.green))
        deleteButton.setImageDrawable(background1)
        deleteButton.setOnClickListener {
            val background = ContextCompat.getDrawable(this, R.drawable.anim_trash)
            background.setTint(ContextCompat.getColor(this, R.color.green))
            deleteButton.setImageDrawable(background)
            (deleteButton.drawable as AnimatedVectorDrawable).start()
        }

        cutButton.setOnClickListener {
            val background = ContextCompat.getDrawable(this, R.drawable.anim_scissors)
            background.setTint(ContextCompat.getColor(this, R.color.green))
            cutButton.setImageDrawable(background)
            (cutButton.drawable as AnimatedVectorDrawable).start()
        }

    }



}
