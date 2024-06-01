package com.imnidasoftware.newsmultiplatform.di

import com.imnidasoftware.newsmultiplatform.articles.di.articlesModule
import com.imnidasoftware.newsmultiplatform.sources.di.sourcesModule

val sharedKoinModules = listOf(
    articlesModule,
    sourcesModule,
    networkModule
)