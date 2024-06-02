package com.imnidasoftware.newsmultiplatform

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.CanvasBasedWindow
import com.imnidasoftware.newsmultiplatform.di.initKoin
import com.imnidasoftware.newsmultiplatform.ui.App

val koin = initKoin()

@OptIn(ExperimentalComposeUiApi::class)
fun main() {

    CanvasBasedWindow("NewsMultiplatform") {

        Surface(modifier = Modifier.fillMaxSize()) {
            App(koin)
        }
    }
}