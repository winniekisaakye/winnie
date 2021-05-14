package com.example.winnieshoecentrenakawa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Open : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)
        val l=findViewById<Button>(R.id.btnopener)
        l.setOnClickListener {
            startActivity(Intent(this,Order::class.java))

        var x=ArrayList<ProductsAdapter>()

        x.add(ProductsAdapter(R.drawable.cross,"jungle",15000))

        x.add(ProductsAdapter(R.drawable.girly,"sneaker",18000))
        x.add(ProductsAdapter(R.drawable.flexy,"canvas",20000))
        x.add(ProductsAdapter(R.drawable.zigzag,"jung",18000))
        x.add(ProductsAdapter(R.drawable.wavy,"ju",20000))
        x.add(ProductsAdapter(R.drawable.twolayer,"j",15000))
        x.add(ProductsAdapter(R.drawable.triangle,"jun",16000))
        x.add(ProductsAdapter(R.drawable.superb,"jug",18000))
        val n=findViewById<ListView>(R.id.lst4)
        n.adapter=Produce(x,this)
    }
}

class Produce(var a: ArrayList<ProductsAdapter>,var b: Context): BaseAdapter() {
    val s = a
    val y = b
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater =y!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val g = inflater.inflate(R.layout.items, p2, false)
        val b = g.findViewById<ImageView>(R.id.imageView2)


        val k = g.findViewById<TextView>(R.id.textView3)
        val t = g.findViewById<TextView>(R.id.textView4)

        k.text = s[p0].name
        t.text = s[p0].price
        b.setImageResource(s[p0].image!!)


        return g

    }

    override fun getItem(p0: Int): Any {

        return s.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return s.size
    }


}
}