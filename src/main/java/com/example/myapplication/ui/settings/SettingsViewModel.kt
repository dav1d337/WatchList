package com.example.myapplication.ui.settings

import com.example.myapplication.repositories.RemoteMovieRepository
import com.example.myapplication.utils.BaseViewModel
import com.example.myapplication.utils.SchedulerFacade
import javax.inject.Inject

class SettingsViewModel
@Inject
constructor(
    schedulerFacade: SchedulerFacade,
    movieService: RemoteMovieRepository
) : BaseViewModel(schedulerFacade) {

}
