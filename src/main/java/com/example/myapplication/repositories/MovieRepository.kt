package com.example.myapplication.repositories

import com.example.myapplication.Movie
import io.reactivex.Observable

interface MovieRepository {
    fun getMovies(): Observable<List<Movie>>
}