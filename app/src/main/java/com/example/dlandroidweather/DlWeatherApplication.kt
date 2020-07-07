package com.example.dlandroidweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class DlWeatherApplication: Application() {
    companion object {
        const val TOKEN = "FEP2fHIVIwXbsaPc"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}