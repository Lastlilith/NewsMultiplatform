package com.imnidasoftware.newsmultiplatform.sources.presentation

import com.imnidasoftware.newsmultiplatform.sources.application.Source

data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)