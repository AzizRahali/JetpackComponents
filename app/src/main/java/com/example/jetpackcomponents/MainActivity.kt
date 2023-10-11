package com.example.jetpackcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.jetpackcomponents.ui.theme.JetpackComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = "OverlayLayout") {
                    composable("OverlayLayout") {
                        Column {
                            //OverlayLayout(modifier = Modifier.fillMaxSize(),content1 = { PushNotificationDemo(n = 5) }, content2 = { WebViewComponent() })
                            OverlayLayout(content1 = { PushNotificationDemo(n = 7, navController) }, content2 = {WebViewComponent()})


                        }
                    }
                    composable("DestinationScreen") {
                        DestinationScreen()
                    }
                }
                // A surface container using the 'background' color from the theme


                }
            }
        }
    }


