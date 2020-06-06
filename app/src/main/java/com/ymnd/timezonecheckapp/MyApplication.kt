package com.ymnd.timezonecheckapp

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import net.danlew.android.joda.JodaTimeAndroid

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        JodaTimeAndroid.init(this)
    }
}