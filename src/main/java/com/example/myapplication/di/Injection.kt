package com.example.myapplication.di

import com.example.myapplication.MovieApi
import com.example.myapplication.repositories.MovieRepository
import com.example.myapplication.repositories.RemoteMovieRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Injection {

    fun provideRepository(): MovieRepository =
        RemoteMovieRepository


    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun provideMovieApi(): MovieApi {
        return provideRetrofit().create(MovieApi::class.java)
    }
}