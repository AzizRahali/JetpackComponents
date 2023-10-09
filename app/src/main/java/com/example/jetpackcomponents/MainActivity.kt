package com.example.jetpackcomponents

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.zIndex

import com.example.jetpackcomponents.ui.theme.JetpackComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsTheme {
                // A surface container using the 'background' color from the theme
                Column {
                    OverlayLayout(modifier = Modifier.fillMaxSize(),content1 = { PushNotificationDemo(n = 5) }, content2 = { WebViewComponent() })

                    }

                }
            }
        }
    }
    @Composable
    fun WebViewComponent() {
        
        AndroidView(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(0f),
            factory = { context ->
                WebView(context).apply {
                    webViewClient = WebViewClient()
                    loadUrl("https://www.bmw.com") // Load your URL here
                }
            }
        )
    }

