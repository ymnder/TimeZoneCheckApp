# TimeZoneCheckApp

This app investigates whether tz datebase is updated through Android Studio 4.0 backport API.

```
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: 4.4.2, Android SDK built for x86, generic_x86
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ---- tz database version ----
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device: 2013h
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP: 2020a
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda: 2020a
06-07 11:04:12.634 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ---- Africa/Casablanca ----
06-07 11:04:12.644 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2020-05-24T00:00+01:00[Africa/Casablanca]
06-07 11:04:12.644 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2020-05-24T01:00+01:00[Africa/Casablanca]
06-07 11:04:12.644 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2020-05-24T02:00+01:00[Africa/Casablanca]
06-07 11:04:12.654 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2020-05-24T00:00Z[Africa/Casablanca]
06-07 11:04:12.654 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2020-05-24T01:00Z[Africa/Casablanca]
06-07 11:04:12.654 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2020-05-24T02:00Z[Africa/Casablanca]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2020-05-24T00:00:00.000Z
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2020-05-24T01:00:00.000Z
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2020-05-24T02:00:00.000Z
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ---- Pacific/Fiji ----
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2019-11-03T00:00+13:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2019-11-03T01:00+13:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Device, 2019-11-03T02:00+13:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2019-11-03T00:00+12:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2019-11-03T01:00+12:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: ThreeTenABP, 2019-11-03T02:00+12:00[Pacific/Fiji]
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2019-11-03T00:00:00.000+12:00
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2019-11-03T01:00:00.000+12:00
06-07 11:04:12.664 9956-9956/com.ymnd.timezonecheckapp V/TZ_TEST: Joda, 2019-11-03T02:00:00.000+12:00
```

## Libraries
[JakeWharton/ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
[dlew/joda-time-android](https://github.com/dlew/joda-time-android)

## Reference
[java.time customizations](https://developer.android.com/studio/write/java8-support-table#java-time-customizations)
[News for the tz database](https://data.iana.org/time-zones/tzdb/NEWS)