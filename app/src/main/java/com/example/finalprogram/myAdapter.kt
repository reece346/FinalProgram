package com.example.finalprogram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(val mydata: List<myData>) : RecyclerView.Adapter<myAdapter.MyViewHolder>() {
    class MyViewHolder(val cardView: View) : RecyclerView.ViewHolder(cardView) {
        val titleText: TextView = cardView.findViewById(R.id.textView1)
        val dateText: TextView = cardView.findViewById(R.id.textView2)
        val descText: TextView = cardView.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleText.text = mydata[position].title
        holder.dateText.text = mydata[position].date
        holder.descText.text = mydata[position].description
    }

    override fun getItemCount(): Int {
        return (mydata.size)
    }
}