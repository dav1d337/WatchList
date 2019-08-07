package com.example.myapplication

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MovieApi {
    @GET("movie/now_playing")
    fun getNowPlayingMovies(@QueryMap map : Map<String, String>): Observable<List<Movie>>
}