package com.example.myapplication.db

import com.example.myapplication.Movie
import io.reactivex.Flowable

interface MovieRepository {
    fun getAll(): Flowable<List<Movie>>

    fun get(id: Long): Flowable<Movie>

    fun deleteAll()

    fun insert(movie: Movie): Long
}