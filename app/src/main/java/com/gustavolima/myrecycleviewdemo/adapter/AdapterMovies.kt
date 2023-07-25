package com.gustavolima.myrecycleviewdemo.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gustavolima.myrecycleviewdemo.model.Movie

class AdapterMovies(private val context: Context, private val movieList: MutableList<Movie>) :
    RecyclerView.Adapter<AdapterMovies.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}
}