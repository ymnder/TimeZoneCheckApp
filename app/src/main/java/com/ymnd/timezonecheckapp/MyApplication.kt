package com.ymnd.timezonecheckapp

import androidx.multidex.MultiDexApplication
import com.jakewharton.threetenabp.AndroidThreeTen
import net.danlew.android.joda.JodaTimeAndroid

class MyApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        JodaTimeAndroid.init(this)
    }
}