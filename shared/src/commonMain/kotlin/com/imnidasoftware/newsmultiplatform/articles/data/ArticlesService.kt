package com.imnidasoftware.newsmultiplatform.articles.data

import com.imnidasoftware.newsmultiplatform.articles.data.ArticleRaw
import com.imnidasoftware.newsmultiplatform.articles.data.ArticlesResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {

    private val country = "us"
    private val category = "business"
    private val apiKey = "ac45f57df82b4ca49493668f621c4ac8"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse =
            httpClient.get("https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey")
                .body()
        return response.articles
    }
}