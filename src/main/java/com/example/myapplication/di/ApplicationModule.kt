package com.example.myapplication.di

import android.app.Application
import android.content.Context
import com.example.myapplication.utils.AndroidSchedulerFacade
import com.example.myapplication.utils.SchedulerFacade
import dagger.Module
import dagger.Provides


@Module
class ApplicationModule (private val app: Application){


    @Provides
    @ApplicationScope
    internal fun provideScheduler(): SchedulerFacade {
        return AndroidSchedulerFacade()
    }

    @Provides
    @ApplicationScope
    internal fun context(): Context {
        return app
    }


}