package com.example.myapplication.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.Movie
import com.example.myapplication.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title = itemView.findViewById<TextView>(R.id.title)
    // private val image = itemView.findViewById<ImageView>(R.id.image)

    var item: Movie? = null

    fun bindTo(movie: Movie) {
        item = movie

        title.text = movie.title

    }
}