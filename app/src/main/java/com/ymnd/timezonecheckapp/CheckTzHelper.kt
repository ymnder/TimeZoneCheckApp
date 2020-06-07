package com.ymnd.timezonecheckapp

import android.os.Build
import android.util.Log
import android.util.TimeUtils
import androidx.annotation.VisibleForTesting
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

    @VisibleForTesting
    fun getDeviceOsVersion() = "${Build.VERSION.RELEASE}, ${Build.MODEL}, ${Build.DEVICE}"

    fun printDeviceOsVersion() {
        Log.v("TZ_TEST", getDeviceOsVersion())
    }

    @VisibleForTesting
    fun getTimeZoneDatabaseVersion() = TimeUtils.getTimeZoneDatabaseVersion()

    fun printTzVersion() {
        Log.v("TZ_TEST", "---- tz database version ----")
        Log.v("TZ_TEST", "Device: ${getTimeZoneDatabaseVersion()}")
        Log.v("TZ_TEST", "ThreeTenABP: 2020a")
        Log.v("TZ_TEST", "Joda: 2020a")
    }

    @VisibleForTesting
    fun getDateTime(targetDate: TargetDate): List<String> {
        val dateTimeLogs = mutableListOf<String>()
        for (hour in 0..2) {
            val deviceZoneId = ZoneId.of(targetDate.zoneId)
            val deviceDateTime = ZonedDateTime.of(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, deviceZoneId)
            dateTimeLogs.add("Device, $deviceDateTime")
        }

        for (hour in 0..2) {
            val threeTenZoneId = org.threeten.bp.ZoneId.of(targetDate.zoneId)
            val threeTenDateTime = org.threeten.bp.ZonedDateTime.of(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, threeTenZoneId)
            dateTimeLogs.add("ThreeTenABP, $threeTenDateTime")
        }

        for (hour in 0..2) {
            val jodaZoneId = DateTimeZone.forID(targetDate.zoneId)
            val jodaDateTime = DateTime(targetDate.year, targetDate.month, targetDate.day, hour, 0, 0, 0, jodaZoneId)
            dateTimeLogs.add("Joda, $jodaDateTime")
        }
        return dateTimeLogs
    }

    fun printDateTime(targetDate: TargetDate) {
        Log.v("TZ_TEST", "---- ${targetDate.zoneId} ----")
        getDateTime(targetDate).forEach {
            Log.v("TZ_TEST", it)
        }
    }
}