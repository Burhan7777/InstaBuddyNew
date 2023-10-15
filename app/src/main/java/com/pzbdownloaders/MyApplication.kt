package com.pzbdownloaders

import android.app.Application
import com.downloader.PRDownloader
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        PRDownloader.initialize(applicationContext)
    }
}