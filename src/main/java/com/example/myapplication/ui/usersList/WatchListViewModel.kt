package com.example.myapplication.ui.usersList

import com.example.myapplication.repositories.RemoteMovieRepository
import com.example.myapplication.utils.BaseViewModel
import com.example.myapplication.utils.SchedulerFacade
import javax.inject.Inject

class WatchListViewModel
@Inject
constructor(
    schedulerFacade: SchedulerFacade,
    movieService: RemoteMovieRepository
) : BaseViewModel(schedulerFacade) {

}
