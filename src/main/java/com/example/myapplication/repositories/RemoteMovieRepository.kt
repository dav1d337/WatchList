package com.example.myapplication.repositories

import android.util.Log
import com.example.myapplication.App
import com.example.myapplication.Movie
import com.example.myapplication.MovieApi
import com.example.myapplication.MoviesResponse
import com.example.myapplication.di.ApplicationScope
import com.example.myapplication.utils.SchedulerFacade
import com.google.gson.Gson
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Scheduler
import retrofit2.Retrofit
import javax.inject.Inject

@ApplicationScope
class RemoteMovieRepository
@Inject constructor(private val gson: Gson,
                    private val retrofit: Retrofit,
                    private val scheduler: SchedulerFacade
) : MovieRepository {

    private val api = retrofit.create(MovieApi::class.java)


    override fun getMovies(): Flowable<MoviesResponse> {
        return api.getNowPlayingMovies()
    }

    private fun createQueryMap(): Map<String, String>{
        return hashMapOf(
            "language" to "en",
            "sort_by" to "popularity.desc"
        )
    }
}