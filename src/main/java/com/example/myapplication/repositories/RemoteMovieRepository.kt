package com.example.myapplication.repositories

import com.example.myapplication.di.Injection
import com.example.myapplication.Movie
import io.reactivex.Observable

object RemoteMovieRepository: MovieRepository {

    private val api = Injection.provideMovieApi()

    override fun getMovies(): Observable<List<Movie>> {
        return api.getNowPlayingMovies(createQueryMap())
    }

    private fun createQueryMap(): Map<String, String>{
        return hashMapOf(
            "language" to "en",
            "sort_by" to "popularity.desc"
        )
    }
}