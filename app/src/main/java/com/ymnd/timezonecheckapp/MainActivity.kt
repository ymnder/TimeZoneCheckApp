package com.ymnd.timezonecheckapp

import android.icu.util.TimeZone
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import java.time.ZoneId
import java.time.ZonedDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("TZ_TEST: Device", TimeZone.getTZDataVersion().toString())
        Log.v("TZ_TEST: ThreeTenABP", "2020a")
        Log.v("TZ_TEST: Joda", "2020a")

        compareCasablanca()
        compareFiji()
    }

    private fun compareCasablanca() {
        val casablancaZoneId = "Africa/Casablanca"

        for (hour in 0..2) {
            val dawsonZoneId = ZoneId.of(casablancaZoneId)
            val dawsonTime = ZonedDateTime.of(2020, 5, 24, hour, 0, 0, 0, dawsonZoneId)

            val dawsonZoneIdBy310 = org.threeten.bp.ZoneId.of(casablancaZoneId)
            val dawsonTimeBy310 = org.threeten.bp.ZonedDateTime.of(2020, 5, 24, hour, 0, 0, 0, dawsonZoneIdBy310)

            val dawsonZoneIdByJoda = DateTimeZone.forID(casablancaZoneId)
            val dawsonTimeByJoda = DateTime(2020, 5, 24, hour, 0, 0, 0, dawsonZoneIdByJoda)

            println("TZ_TEST: default, $dawsonTime")
            println("TZ_TEST: ThreeTenABP, $dawsonTimeBy310")
            println("TZ_TEST: Joda, $dawsonTimeByJoda")
        }
    }

    private fun compareFiji() {
        val fijiZoneId = "Pacific/Fiji"

        for (hour in 0..2) {
            val dawsonZoneId = ZoneId.of(fijiZoneId)
            val dawsonTime = ZonedDateTime.of(2019, 11, 3, hour, 0, 0, 0, dawsonZoneId)

            val dawsonZoneIdBy310 = org.threeten.bp.ZoneId.of(fijiZoneId)
            val dawsonTimeBy310 = org.threeten.bp.ZonedDateTime.of(2019, 11, 3, hour, 0, 0, 0, dawsonZoneIdBy310)

            val dawsonZoneIdByJoda = DateTimeZone.forID(fijiZoneId)
            val dawsonTimeByJoda = DateTime(2019, 11, 3, hour, 0, 0, 0, dawsonZoneIdByJoda)

            println("TZ_TEST: default, $dawsonTime")
            println("TZ_TEST: ThreeTenABP, $dawsonTimeBy310")
            println("TZ_TEST: Joda, $dawsonTimeByJoda")
        }
    }
}