package com.example.myapplication.repositories

import com.example.myapplication.Movie
import com.example.myapplication.MoviesResponse
import io.reactivex.Flowable
import io.reactivex.Observable

interface MovieRepository {
    fun getMovies(): Flowable<MoviesResponse>
}