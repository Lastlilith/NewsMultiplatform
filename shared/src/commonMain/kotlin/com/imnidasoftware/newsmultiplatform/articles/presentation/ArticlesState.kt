package com.imnidasoftware.newsmultiplatform.articles.presentation

import com.imnidasoftware.newsmultiplatform.articles.application.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null,
    )
