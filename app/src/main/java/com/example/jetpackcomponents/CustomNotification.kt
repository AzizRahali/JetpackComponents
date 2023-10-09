package com.example.jetpackcomponents


import androidx.compose.foundation.layout.*


import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex

@Composable
fun PushNotificationDemo(n : Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
            .zIndex(1f)


            ,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onError,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
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

@Composable
fun PushNotificationScreen() {
    Column(

    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter){
        PushNotificationDemo(5)}
    }
}
