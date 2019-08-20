package com.example.myapplication

import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MovieApi {
    @GET("discover/movie?sort_by=popularity.desc")
    fun getNowPlayingMovies(): Flowable<MoviesResponse>
}