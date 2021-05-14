package com.example.winnieshoecentrenakawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton

class ShoeSamples : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe_samples)
        val j=findViewById<RadioButton>(R.id.jun)
        j.setOnClickListener{
            startActivity(Intent(this,Jungles::class.java))
        }
        val p=findViewById<RadioButton>(R.id.pum)
        p.setOnClickListener {
            startActivity(Intent(this,Pumps::class.java))
        }
        val o=findViewById<RadioButton>(R.id.open)
        o.setOnClickListener {
            startActivity(Intent(this,Open::class.java))
        }
        val c=findViewById<RadioButton>(R.id.can)
        c.setOnClickListener {
            startActivity(Intent(this,Canvas::class.java))
        }


    }
}