package com.ymnd.timezonecheckapp

import android.os.Build
import android.util.Log
import android.util.TimeUtils
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import java.time.ZoneId
import java.time.ZonedDateTime

class CheckTzHelper {
    data class TargetDate(
        val zoneId: String,
        val year: Int,
        val month: Int,
        val day: Int
    )

    fun printDeviceOsVersion() {
        Log.v("TZ_TEST", "${Build.VERSION.RELEASE}, ${Build.MODEL}, ${Build.DEVICE}")
    }

    fun printTzVersion() {
        Log.v("TZ_TEST", "---- tz database version ----")
        Log.v("TZ_TEST", "Device: ${TimeUtils.getTimeZoneDatabaseVersion()}")
        Log.v("TZ_TEST", "ThreeTenABP: 2020a")
        Log.v("TZ_TEST", "Joda: 2020a")
    }

    fun printDateTime(targetDate: TargetDate) {

        Log.v("TZ_TEST", "---- ${targetDate.zoneId} ----")

        for (hour in 0..2) {
            val dawsonZoneId = ZoneId.of(targetDate.zoneId)
            val dawsonTime = ZonedDateTime.of(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, dawsonZoneId)
            Log.v("TZ_TEST", "Device, $dawsonTime")
        }

        for (hour in 0..2) {
            val dawsonZoneIdBy310 = org.threeten.bp.ZoneId.of(targetDate.zoneId)
            val dawsonTimeBy310 = org.threeten.bp.ZonedDateTime.of(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, dawsonZoneIdBy310)
            Log.v("TZ_TEST", "ThreeTenABP, $dawsonTimeBy310")
        }

        for (hour in 0..2) {
            val dawsonZoneIdByJoda = DateTimeZone.forID(targetDate.zoneId)
            val dawsonTimeByJoda = DateTime(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, dawsonZoneIdByJoda)
            Log.v("TZ_TEST", "Joda, $dawsonTimeByJoda")
        }
    }
}