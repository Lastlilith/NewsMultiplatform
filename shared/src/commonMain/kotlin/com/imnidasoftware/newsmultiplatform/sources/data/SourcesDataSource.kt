package com.imnidasoftware.newsmultiplatform.sources.data

import com.imnidasoftware.newsmultiplatform.db.NewsMultiplatformDatabase

class SourcesDataSource(private val db: NewsMultiplatformDatabase) {

    fun getAllSources(): List<SourceRaw> =
        db.newsMultiplatformDatabaseQueries.selectAllSources(::mapSource).executeAsList()

    fun clearSources() =
        db.newsMultiplatformDatabaseQueries.removeAllSources()

    private fun mapSource(
        id: String,
        name: String,
        desc: String,
        language: String,
        country: String
    ): SourceRaw {
        return SourceRaw(
            id,
            name,
            desc,
            language,
            country
        )
    }

    internal fun createSources(sources: List<SourceRaw>) {
        db.newsMultiplatformDatabaseQueries.transaction {
            sources.forEach { source ->
                insertSource(source)
            }
        }
    }

    private fun insertSource(source: SourceRaw) {
        db.newsMultiplatformDatabaseQueries.insertSource(
            source.id,
            source.name,
            source.desc,
            source.language,
            source.country,
        )
    }
}