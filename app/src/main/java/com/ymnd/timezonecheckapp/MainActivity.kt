package com.ymnd.timezonecheckapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val checkTzHelper = CheckTzHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkTzHelper.printDeviceOsVersion()
        checkTzHelper.printTzVersion()
        compareCasablanca()
        compareFiji()
    }

    /**
     * 2020a
     * Morocco springs forward on 2020-05-31, not 2020-05-24.
     */
    private fun compareCasablanca() {
        val targetDate = CheckTzHelper.TargetDate(
            zoneId = "Africa/Casablanca",
            year = 2020,
            month = 5,
            day = 24
        )
        checkTzHelper.printDateTime(targetDate)
    }

    /**
     * 2019c
     * Fiji observes DST from 2019-11-10 to 2020-01-12.
     */
    private fun compareFiji() {
        val targetDate = CheckTzHelper.TargetDate(
            zoneId = "Pacific/Fiji",
            year = 2019,
            month = 11,
            day = 3
        )
        checkTzHelper.printDateTime(targetDate)
    }
}