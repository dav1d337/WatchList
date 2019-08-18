package com.example.myapplication.utils

import io.reactivex.Scheduler

interface SchedulerFacade {
    val io: Scheduler
    val ui: Scheduler
}