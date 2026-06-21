# MG4 Track Mode

A minimal Android launcher app for MG4 vehicles. It acts as a shortcut that opens the
hidden "Track Mode" screen provided by the built-in SAIC maintenance application.

## How it works

When launched, the app immediately starts the Track Mode activity from the SAIC
maintenance package and then closes itself. No user interface is shown.

- Target package: `com.saic.saicmaintenance`
- Target activity: `com.saicmotor.hmi.trackmode.MainActivity`

If the maintenance package is not installed, or the activity cannot be started, a short
message is displayed and the app exits.

## Requirements

- An MG4 in-car Android head unit (or a device with the SAIC maintenance app installed)
- Android 9 (API 28) or higher

## Build

This is a standard Gradle Android project.

```
./gradlew assembleDebug
```

The generated APK can be found under `app/build/outputs/apk/`.

To install on a connected device:

```
./gradlew installDebug
```

## Project details

- Application ID: `com.tommasov.mg4trackmode`
- Minimum SDK: 28
- Target SDK: 34
- Language: Java

## Disclaimer

This app only launches an activity that already exists on the vehicle's system. Use it at
your own risk. The author is not affiliated with SAIC Motor or MG.
