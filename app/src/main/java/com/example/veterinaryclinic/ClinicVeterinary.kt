package com.example.veterinaryclinic

import android.annotation.SuppressLint
import android.app.Application

class ClinicVeterinary : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var prefs : Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}