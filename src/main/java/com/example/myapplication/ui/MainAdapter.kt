package com.example.myapplication.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.Movie
import com.example.myapplication.R

class MainAdapter(var items: List<Movie> /*,val itemClick: () -> Unit */): RecyclerView.Adapter<MainViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindTo(items[position])

        //holder.itemView.setOnClickListener { itemClick(holder.item!!) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movies_card, parent, false)

        return MainViewHolder(view)
    }

    fun replaceData(items: List<Movie>){
        this.items = items
        this.notifyDataSetChanged()
    }
}