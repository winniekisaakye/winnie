package com.example.winnieshoecentrenakawa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Canvas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas)
        val f=findViewById<Button>(R.id.btncanv)
        f.setOnClickListener {
            startActivity(Intent(this,Order::class.java))

        var x=ArrayList<ProductsAdapter>()

        x.add(ProductsAdapter(R.drawable.cross,"jungle",15000))

        x.add(ProductsAdapter(R.drawable.whiter,"sneaker",18000))
        x.add(ProductsAdapter(R.drawable.smart,"canvas",20000))
        x.add(ProductsAdapter(R.drawable.snickerflag    ,"jung",18000))
        x.add(ProductsAdapter(R.drawable.wavy,"ju",20000))
        x.add(ProductsAdapter(R.drawable.light,"j",15000))

        val m=findViewById<ListView>(R.id.lst4)
        m.adapter=Prodigal(x,this)
    }
}
class Prodigal(var a: ArrayList<ProductsAdapter>,var b: Context): BaseAdapter() {
    val s = a
    val y = b
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater =y!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val g = inflater.inflate(R.layout.items, p2, false)

        val b = g.findViewById<ImageView>(R.id.img2)

        val k = g.findViewById<TextView>(R.id.txv1)
        val t = g.findViewById<TextView>(R.id.textView6)

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