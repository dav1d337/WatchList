package com.example.myapplication.ui.explore

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.MoviesResponse
import com.example.myapplication.repositories.RemoteMovieRepository
import com.example.myapplication.utils.BaseViewModel
import com.example.myapplication.utils.SchedulerFacade
import javax.inject.Inject

class ExploreViewModel
@Inject
constructor(
    schedulerFacade: SchedulerFacade,
    movieService: RemoteMovieRepository
) : BaseViewModel(schedulerFacade) {

   val popularMovies = MutableLiveData<MoviesResponse>()

    init {
        subscribeToFlowable(movieService.getMovies()) {
            Log.i("bla", it.movies.size.toString())
            popularMovies.value = it
        }
    }
}