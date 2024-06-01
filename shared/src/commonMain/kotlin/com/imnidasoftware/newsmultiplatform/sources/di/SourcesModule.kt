package com.imnidasoftware.newsmultiplatform.sources.di

import com.imnidasoftware.newsmultiplatform.sources.application.SourcesUseCase
import com.imnidasoftware.newsmultiplatform.sources.data.SourcesDataSource
import com.imnidasoftware.newsmultiplatform.sources.data.SourcesRepository
import com.imnidasoftware.newsmultiplatform.sources.data.SourcesService
import com.imnidasoftware.newsmultiplatform.sources.presentation.SourcesViewModel
import org.koin.dsl.module

val sourcesModule = module {

    single<SourcesService> { SourcesService(get()) }
    single<SourcesUseCase> { SourcesUseCase(get()) }
    single<SourcesDataSource> { SourcesDataSource(get()) }
    single<SourcesRepository> { SourcesRepository(get(), get()) }
    single<SourcesViewModel> { SourcesViewModel(get()) }
}