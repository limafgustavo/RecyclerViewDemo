package com.gustavolima.myrecycleviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gustavolima.myrecycleviewdemo.adapter.AdapterMovies
import com.gustavolima.myrecycleviewdemo.databinding.ActivityMainBinding
import com.gustavolima.myrecycleviewdemo.model.Movie

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterMovies: AdapterMovies
    private val moviesList: MutableList<Movie> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewMovies = binding.recyclerViewMovies
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.setHasFixedSize(true)
        adapterMovies = AdapterMovies(this, moviesList)
        recyclerViewMovies.adapter = adapterMovies
        movies()
    }
    private fun movies(){
        val movie1 = Movie("Mad Max: Fury Road")
        moviesList.add(movie1)

        val movie2 = Movie("John Wick")
        moviesList.add(movie2)

        val movie3 = Movie("Die Hard")
        moviesList.add(movie3)

        val movie4 = Movie("The Dark Knight")
        moviesList.add(movie4)

        val movie5 = Movie("Gladiator")
        moviesList.add(movie5)

        val movie6 = Movie("Inception")
        moviesList.add(movie6)

        val movie7 = Movie("The Avengers")
        moviesList.add(movie7)

        val movie8 = Movie("The Avengers")
        moviesList.add(movie8)

        val movie9 = Movie("Mission: Impossible")
        moviesList.add(movie9)

        val movie10 = Movie("The Matrix")
        moviesList.add(movie10)

        val movie11 = Movie("Mad Max: Fury Road")
        moviesList.add(movie11)

        val movie12 = Movie("Black Panther")
        moviesList.add(movie12)

        val movie13 = Movie("Jurassic Park")
        moviesList.add(movie13)

        val movie14 = Movie("Gladiator")
        moviesList.add(movie14)

        val movie15 = Movie("Avatar")
        moviesList.add(movie15)

        val movie16 = Movie("Fast & Furious")
        moviesList.add(movie16)

        val movie17 = Movie("Wonder Woman")
        moviesList.add(movie17)

        val movie18 = Movie("The Lord of the Rings: The Fellowship of the Ring")
        moviesList.add(movie18)

        val movie19 = Movie("The Terminator")
        moviesList.add(movie19)

        val movie20 = Movie("Black Widow")
        moviesList.add(movie20)
    }
}