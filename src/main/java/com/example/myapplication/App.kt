package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.ApplicationModule
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.NetModule


class App : Application(){


    lateinit var applicationComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerAppComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .netModule(NetModule("http://api.themoviedb.org/3/"))
            .build()


        applicationComponent.inject(this)
    }



}