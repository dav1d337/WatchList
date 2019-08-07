package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.ApplicationModule
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.NetModule


class App : Application(){
    lateinit var appComponent: AppComponent
        private set



    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .netModule(NetModule())
            .build()

        appComponent.inject(this)
    }



}