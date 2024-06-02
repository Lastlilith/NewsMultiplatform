package com.imnidasoftware.newsmultiplatform.di

import app.cash.sqldelight.db.SqlDriver
import com.imnidasoftware.newsmultiplatform.db.DatabaseDriverFactory
import com.imnidasoftware.newsmultiplatform.db.NewsMultiplatformDatabase
import org.koin.dsl.module

val databaseModule = module {
    single<SqlDriver> {DatabaseDriverFactory().createDriver()}
    single<NewsMultiplatformDatabase> {NewsMultiplatformDatabase(get())}
}