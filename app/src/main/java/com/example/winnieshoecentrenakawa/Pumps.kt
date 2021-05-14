package com.example.winnieshoecentrenakawa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Pumps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pumps)
        val p=findViewById<Button>(R.id.btnpump)
        p.setOnClickListener {
           startActivity(Intent(this,Order::class.java))

        var x=ArrayList<ProductsAdapter>()

        x.add(ProductsAdapter(R.drawable.flowers,"jungle",18000))
        x.add(ProductsAdapter(R.drawable.rubber,"sneaker",18000))
        x.add(ProductsAdapter(R.drawable.kyoya,"canvas",18000))
        x.add(ProductsAdapter(R.drawable.pump,"jung",18000))
        val d=findViewById<ListView>(R.id.lst2)
        d.adapter=Product(x,this)

    }
}
class Product(var a: ArrayList<ProductsAdapter>,var b:Context): BaseAdapter() {
    val s = a
    val y = b
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater =y!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val g = inflater.inflate(R.layout.items, p2, false)

        val b = g.findViewById<ImageView>(R.id.imageView)

        val k = g.findViewById<TextView>(R.id.textvie)
        val t = g.findViewById<TextView>(R.id.txv)

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