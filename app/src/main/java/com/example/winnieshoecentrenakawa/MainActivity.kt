package com.example.winnieshoecentrenakawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val b=findViewById<Button>(R.id.log)
        b.setOnClickListener {
           startActivity(Intent(this,ShoeSamples::class.java))

            val image=findViewById<ImageView>(R.id.pink)
            val h= Intent(this,""::class.java)
            val tv=findViewById<TextView>(R.id.tv)
            val c=tv.text.toString()
            h.putExtra("info",c)
            startActivity(h)


            Handler().postDelayed({
                startActivity(Intent(this,ShoeSamples::class.java))
                finish()
            },4000)
            }
        }

    }



