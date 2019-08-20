package com.example.myapplication.ui.explore

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.Movie
import com.example.myapplication.R

class ExploreAdapter(var items: List<Movie> /*,val itemClick: () -> Unit */): RecyclerView.Adapter<ExploreViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindTo(items[position])

        //holder.itemView.setOnClickListener { itemClick(holder.item!!) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movies_card, parent, false)

        return ExploreViewHolder(view)
    }

    fun replaceData(items: List<Movie>){
        this.items = items
        this.notifyDataSetChanged()
    }
}