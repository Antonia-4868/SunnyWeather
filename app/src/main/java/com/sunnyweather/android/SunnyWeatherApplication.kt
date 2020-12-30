package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application(){
//给SunnyWeather项目提供一种全局获取Context的方式（14章）
    companion object{
        const val TOKEN = "cX25oyMjxVqpvtEk"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}