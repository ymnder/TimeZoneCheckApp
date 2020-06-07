package com.ymnd.timezonecheckapp

import android.os.Build
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.KITKAT])
class CheckTzHelperTest {

    private val checkTzHelper = CheckTzHelper()

    @Test
    fun printDeviceOsVersion() {
        assertThat(checkTzHelper.getDeviceOsVersion()).isEqualTo("4.4, robolectric, robolectric")
    }

    @Test
    fun printTimeZoneDatabaseVersion() {
        assertThat(checkTzHelper.getTimeZoneDatabaseVersion()).isEqualTo("2013g")
    }

    @Test
    fun printDateTimeAtCasablanca() {
        val targetDate = CheckTzHelper.TargetDate(
            zoneId = "Africa/Casablanca",
            year = 2020,
            month = 5,
            day = 24
        )

        val expectedLogs = listOf(
            "Device, 2020-05-24T00:00Z[Africa/Casablanca]",
            "Device, 2020-05-24T01:00Z[Africa/Casablanca]",
            "Device, 2020-05-24T03:00+01:00[Africa/Casablanca]",
            "ThreeTenABP, 2020-05-24T00:00Z[Africa/Casablanca]",
            "ThreeTenABP, 2020-05-24T01:00Z[Africa/Casablanca]",
            "ThreeTenABP, 2020-05-24T02:00Z[Africa/Casablanca]",
            "Joda, 2020-05-24T00:00:00.000Z",
            "Joda, 2020-05-24T01:00:00.000Z",
            "Joda, 2020-05-24T02:00:00.000Z"
        )

        assertThat(checkTzHelper.getDateTime(targetDate)).isEqualTo(expectedLogs)
    }

    @Test
    fun printDateTimeAtFiji() {
        val targetDate = CheckTzHelper.TargetDate(
            zoneId = "Pacific/Fiji",
            year = 2019,
            month = 11,
            day = 3
        )

        val expectedLogs = listOf(
            "Device, 2019-11-03T00:00+12:00[Pacific/Fiji]",
            "Device, 2019-11-03T01:00+12:00[Pacific/Fiji]",
            "Device, 2019-11-03T02:00+12:00[Pacific/Fiji]",
            "ThreeTenABP, 2019-11-03T00:00+12:00[Pacific/Fiji]",
            "ThreeTenABP, 2019-11-03T01:00+12:00[Pacific/Fiji]",
            "ThreeTenABP, 2019-11-03T02:00+12:00[Pacific/Fiji]",
            "Joda, 2019-11-03T00:00:00.000+12:00",
            "Joda, 2019-11-03T01:00:00.000+12:00",
            "Joda, 2019-11-03T02:00:00.000+12:00"
        )

        assertThat(checkTzHelper.getDateTime(targetDate)).isEqualTo(expectedLogs)
    }
}