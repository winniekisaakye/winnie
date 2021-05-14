package com.example.winnieshoecentrenakawa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Jungles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jungles)
        val r=findViewById<Button>(R.id.btnjung)
        r.setOnClickListener {
            startActivity(Intent(this,Order::class.java))
        var x=ArrayList<ProductsAdapter>()

      x.add(ProductsAdapter(R.drawable.creamy,"jungle",25000))

        x.add(ProductsAdapter(R.drawable.hybrid,"sneaker",25000))
      x.add(ProductsAdapter(R.drawable.jungleblack,"canvas",25000))
    x.add(ProductsAdapter(R.drawable.junglegrey,"junglew",25000))
        val l=findViewById<ListView>(R.id.lst)
        l.adapter=Products(x,this)
    }
}
class Products(var a: ArrayList<ProductsAdapter>,var b:Context): BaseAdapter() {
    val s = a
    val y = b
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater =y!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val g = inflater.inflate(R.layout.items, p2, false)

        val b = g.findViewById<ImageView>(R.id.imageView)

        val k = g.findViewById<TextView>(R.id.textView)
        val t = g.findViewById<TextView>(R.id.textView2)

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





