package com.example.winnieshoecentrenakawa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        val web=findViewById<WebView>(R.id.view)
        web.loadUrl("https://ugabox.com")
    }
}