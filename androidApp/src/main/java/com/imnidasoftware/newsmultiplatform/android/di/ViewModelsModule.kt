package com.imnidasoftware.newsmultiplatform.android.di

import com.imnidasoftware.newsmultiplatform.articles.presentation.ArticlesViewModel
import com.imnidasoftware.newsmultiplatform.sources.presentation.SourcesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { ArticlesViewModel(get()) }
    viewModel { SourcesViewModel(get()) }
}