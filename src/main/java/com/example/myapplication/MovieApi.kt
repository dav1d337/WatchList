package com.example.myapplication

import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MovieApi {
    @GET("movie/popular")
    fun getNowPlayingMovies(): Flowable<MoviesResponse>
}