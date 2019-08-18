package com.example.myapplication.di

import com.example.myapplication.App
import com.example.myapplication.ui.MainFragment
import com.example.myapplication.repositories.RemoteMovieRepository
import dagger.Component

@ApplicationScope
@Component(modules = [(ApplicationModule::class),(NetModule::class)])
interface AppComponent {

    //fun newApplicationComponent(module: ApplicationModule): AppComponent

    fun inject(app: App)
    fun inject(mainFragment: MainFragment)
    fun inject(movieRepo: RemoteMovieRepository)
}
