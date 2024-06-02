package com.imnidasoftware.newsmultiplatform.android.di

import app.cash.sqldelight.db.SqlDriver
import com.imnidasoftware.newsmultiplatform.db.DatabaseDriverFactory
import com.imnidasoftware.newsmultiplatform.db.NewsMultiplatformDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single<SqlDriver> { DatabaseDriverFactory(androidContext()).createDriver()!! }
    single<NewsMultiplatformDatabase> { NewsMultiplatformDatabase(get()) }
}