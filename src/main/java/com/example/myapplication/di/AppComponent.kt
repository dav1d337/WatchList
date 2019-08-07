package com.example.myapplication.di

import com.example.myapplication.App
import dagger.Component

@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class,NetModule::class))
interface AppComponent {

    fun inject(app: App)
}
