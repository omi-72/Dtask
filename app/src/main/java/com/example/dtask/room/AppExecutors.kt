package com.example.dtask.room

import java.util.concurrent.Executor
import java.util.concurrent.Executors

class AppExecutors private constructor(private val diskIO: Executor) {

    companion object {
        private val LOCK = Any()
        private var sInstance: AppExecutors? = null

        fun getInstance(): AppExecutors {
            if (sInstance == null) {
                synchronized(LOCK) {
                    sInstance = AppExecutors(Executors.newSingleThreadExecutor())
                }
            }
            return sInstance!!
        }
    }

    fun diskIO(): Executor {
        return diskIO
    }
}