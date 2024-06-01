package com.imnidasoftware.newsmultiplatform.articles.data

class ArticlesRepository(
    private val datasource: ArticlesDatasource,
    private val service: ArticlesService
) {

    suspend fun getArticles(forceFetch: Boolean): List<ArticleRaw> {
        if (forceFetch) {
            datasource.clearArticles()
            return fetchArticles()
        }

        val articlesDb = datasource.getAllArticles()
        println("Got ${articlesDb.size} from the database")

        if (articlesDb.isEmpty()) {
            return fetchArticles()
        }

        return articlesDb
    }

    private suspend fun fetchArticles():List<ArticleRaw> {
        val fetchedArticles = service.fetchArticles()
        datasource.insertArticles(fetchedArticles)
        return fetchedArticles
    }
}