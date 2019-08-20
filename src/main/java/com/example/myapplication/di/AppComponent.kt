package com.example.myapplication.di

import com.example.myapplication.App
import com.example.myapplication.ui.explore.ExploreFragment
import com.example.myapplication.repositories.RemoteMovieRepository
import com.example.myapplication.ui.settings.SettingsFragment
import com.example.myapplication.ui.usersList.WatchListFragment
import dagger.Component

@ApplicationScope
@Component(modules = [(ApplicationModule::class),(NetModule::class)])
interface AppComponent {

    //fun newApplicationComponent(module: ApplicationModule): AppComponent

    fun inject(app: App)
    fun inject(exploreFragment: ExploreFragment)
    fun inject(movieRepo: RemoteMovieRepository)
    fun inject(watchlist: WatchListFragment)
    fun inject(settings: SettingsFragment)
}
