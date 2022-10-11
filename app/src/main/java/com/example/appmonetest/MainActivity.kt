package com.example.appmonetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun callLoadImage(view: View) {


        val iv:ImageView = findViewById(R.id.iv_logo)
        Picasso.get().load("https://pbs.twimg.com/media/E-uMzkHXMAA1tTx.jpg").into(iv)


    }
}