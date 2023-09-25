package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ChangeImage (view : View){
        val button: Button = findViewById(R.id.button)
        val imageView : ImageView = findViewById(R.id.imageView2)

        button.setOnClickListener {
            imageView.setImageResource(R.drawable.brain)
        }
    }
}