package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Web=findViewById<CardView>(R.id.cardWeb)
        val Cam=findViewById<CardView>(R.id.cardCamera)
        Web.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://nilesh091.github.io/Project/")
            startActivity(intent)
        }
        Cam.setOnClickListener {
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            //intent.data= Uri.parse("https://nilesh091.github.io/Project/")
            startActivity(intent)
        }
    }
}