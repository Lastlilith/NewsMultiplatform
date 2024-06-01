package com.imnidasoftware.newsmultiplatform.android

import android.app.Application
import com.imnidasoftware.newsmultiplatform.android.di.databaseModule
import com.imnidasoftware.newsmultiplatform.android.di.viewModelsModule
import com.imnidasoftware.newsmultiplatform.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NewsApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule + databaseModule

        startKoin {
            androidContext(this@NewsApp)
            modules(modules)
        }
    }
}