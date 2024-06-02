package com.imnidasoftware.newsmultiplatform.articles.data

import com.imnidasoftware.newsmultiplatform.db.NewsMultiplatformDatabase

class ArticlesDatasource(private val database: NewsMultiplatformDatabase?) {

    fun getAllArticles(): List<ArticleRaw> =
        database?.newsMultiplatformDatabaseQueries?.selectAllArticles(::mapToArticleRaw)
            ?.executeAsList() ?: listOf()

    fun insertArticles(articles: List<ArticleRaw>) {
        database?.newsMultiplatformDatabaseQueries?.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    fun clearArticles() =
        database?.newsMultiplatformDatabaseQueries?.removeAllArticles()

    private fun insertArticle(articleRaw: ArticleRaw) {
        database?.newsMultiplatformDatabaseQueries?.insertArticle(
            articleRaw.title,
            articleRaw.desc,
            articleRaw.date,
            articleRaw.imageUrl
        )
    }


    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}