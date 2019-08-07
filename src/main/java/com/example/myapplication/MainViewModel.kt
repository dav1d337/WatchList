package com.example.myapplication

import com.example.myapplication.di.Injection
import javax.inject.Inject

class MainViewModel
@Inject
constructor(
    schedulerFacade: SchedulerFacade
) : BaseViewModel(schedulerFacade) {

  //  val popularMovies = MutableLiveData<Movie>()

    init {
        val repository = Injection.provideRepository()
        val popularMovies = repository.getMovies()
        subscribeToObservable(repository.getMovies()) {}
    }
}