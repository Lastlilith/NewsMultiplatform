package com.imnidasoftware.newsmultiplatform.sources.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class SourcesService(private val httpClient: HttpClient) {
    private val apiKey = "ac45f57df82b4ca49493668f621c4ac8"
    suspend fun fetchSources(): List<SourceRaw> {

        val response: SourcesResponse =
            httpClient.get("https://newsapi.org/v2/top-headlines/sources?apiKey=$apiKey").body()
        return response.sources
    }
}