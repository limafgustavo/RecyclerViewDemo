package com.gustavolima.myrecycleviewdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gustavolima.myrecycleviewdemo.databinding.MovieItemBinding
import com.gustavolima.myrecycleviewdemo.model.Movie

class AdapterMovies(private val context: Context, private val movieList: MutableList<Movie>) :
    RecyclerView.Adapter<AdapterMovies.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemList = MovieItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MovieViewHolder(itemList)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.textMoviewTitle.text = movieList[position].title
    }

    inner class MovieViewHolder(binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val textMoviewTitle = binding.textMovieTitle
    }
}