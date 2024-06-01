package com.imnidasoftware.newsmultiplatform.articles.di

import com.imnidasoftware.newsmultiplatform.articles.data.ArticlesDatasource
import com.imnidasoftware.newsmultiplatform.articles.data.ArticlesRepository
import com.imnidasoftware.newsmultiplatform.articles.data.ArticlesService
import com.imnidasoftware.newsmultiplatform.articles.application.ArticlesUseCase
import com.imnidasoftware.newsmultiplatform.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDatasource> { ArticlesDatasource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}