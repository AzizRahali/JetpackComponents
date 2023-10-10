package com.example.jetpackcomponents


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape


import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController

@Composable
fun PushNotificationDemo(
    n: Int,
    //onClick: () -> Unit

) {


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
            .zIndex(1f),
            //.clickable {            },TODO:Implement the navigation to destination screen logic



    colors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.onError,
    ),
    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Circular logo on the left
            Image(
                painter = painterResource(id = R.drawable.bmw), // Replace with your logo resource
                contentDescription = "BMWLogo", // Provide an appropriate content description
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape) // Clip the image to a circle
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "MyHighlights",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                Text(
                    text = "You have $n new Highlights!",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun PushNotificationScreen() {
    val navController = NavController


    PushNotificationDemo(n = 7)
}

