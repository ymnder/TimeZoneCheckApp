# TimeZoneCheckApp

This app investigates whether tz database is updated through Android Studio 4.0 backport API.

## Summary
- The tz database has not changed with using desugaring API.
- The tz database seems to be provided by the device the same as before.
- According to [Time Zone Rules](https://source.android.com/devices/tech/config/timezone-rules),  the tz database may be updated with Android 8.1 and higher versions.

```
V/TZ_TEST: 4.4.2, Android SDK built for x86, generic_x86
V/TZ_TEST: ---- tz database version ----
V/TZ_TEST: Device: 2013h
V/TZ_TEST: ThreeTenABP: 2020a
V/TZ_TEST: Joda: 2020a
V/TZ_TEST: ---- Africa/Casablanca ----
V/TZ_TEST: Device, 2020-05-24T00:00+01:00[Africa/Casablanca]
V/TZ_TEST: Device, 2020-05-24T01:00+01:00[Africa/Casablanca]
V/TZ_TEST: Device, 2020-05-24T02:00+01:00[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T00:00Z[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T01:00Z[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T02:00Z[Africa/Casablanca]
V/TZ_TEST: Joda, 2020-05-24T00:00:00.000Z
V/TZ_TEST: Joda, 2020-05-24T01:00:00.000Z
V/TZ_TEST: Joda, 2020-05-24T02:00:00.000Z
V/TZ_TEST: ---- Pacific/Fiji ----
V/TZ_TEST: Device, 2019-11-03T00:00+13:00[Pacific/Fiji]
V/TZ_TEST: Device, 2019-11-03T01:00+13:00[Pacific/Fiji]
V/TZ_TEST: Device, 2019-11-03T02:00+13:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T00:00+12:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T01:00+12:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T02:00+12:00[Pacific/Fiji]
V/TZ_TEST: Joda, 2019-11-03T00:00:00.000+12:00
V/TZ_TEST: Joda, 2019-11-03T01:00:00.000+12:00
V/TZ_TEST: Joda, 2019-11-03T02:00:00.000+12:00

V/TZ_TEST: 10, Pixel 3, blueline
V/TZ_TEST: ---- tz database version ----
V/TZ_TEST: Device: 2019c
V/TZ_TEST: ThreeTenABP: 2020a
V/TZ_TEST: Joda: 2020a
V/TZ_TEST: ---- Africa/Casablanca ----
V/TZ_TEST: Device, 2020-05-24T00:00Z[Africa/Casablanca]
V/TZ_TEST: Device, 2020-05-24T01:00Z[Africa/Casablanca]
V/TZ_TEST: Device, 2020-05-24T03:00+01:00[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T00:00Z[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T01:00Z[Africa/Casablanca]
V/TZ_TEST: ThreeTenABP, 2020-05-24T02:00Z[Africa/Casablanca]
V/TZ_TEST: Joda, 2020-05-24T00:00:00.000Z
V/TZ_TEST: Joda, 2020-05-24T01:00:00.000Z
V/TZ_TEST: Joda, 2020-05-24T02:00:00.000Z
V/TZ_TEST: ---- Pacific/Fiji ----
V/TZ_TEST: Device, 2019-11-03T00:00+12:00[Pacific/Fiji]
V/TZ_TEST: Device, 2019-11-03T01:00+12:00[Pacific/Fiji]
V/TZ_TEST: Device, 2019-11-03T02:00+12:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T00:00+12:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T01:00+12:00[Pacific/Fiji]
V/TZ_TEST: ThreeTenABP, 2019-11-03T02:00+12:00[Pacific/Fiji]
V/TZ_TEST: Joda, 2019-11-03T00:00:00.000+12:00
V/TZ_TEST: Joda, 2019-11-03T01:00:00.000+12:00
V/TZ_TEST: Joda, 2019-11-03T02:00:00.000+12:00
```

## Libraries
 - [JakeWharton/ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
 - [dlew/joda-time-android](https://github.com/dlew/joda-time-android)
 - [robolectric/robolectric](https://github.com/robolectric/robolectric/releases)
 - [joel-costigliola/assertj-core](https://github.com/joel-costigliola/assertj-core)

## Reference
 - [java.time customizations](https://developer.android.com/studio/write/java8-support-table#java-time-customizations)
 - [News for the tz database](https://data.iana.org/time-zones/tzdb/NEWS)
 - [desugar_jdk_libs.json](https://r8.googlesource.com/r8/+/refs/heads/master/src/library_desugar/desugar_jdk_libs.json)
 - [D8 Library Desugaring](https://jakewharton.com/d8-library-desugaring/)
