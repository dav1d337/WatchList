package com.example.myapplication

import io.reactivex.Scheduler

interface SchedulerFacade {
    val io: Scheduler
    val ui: Scheduler
}