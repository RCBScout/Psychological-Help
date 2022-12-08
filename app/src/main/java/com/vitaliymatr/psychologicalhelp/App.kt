package com.vitaliymatr.psychologicalhelp

import android.app.Application
import androidx.annotation.StringRes

class App : Application() {
    companion object {
        lateinit var instance: App private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
