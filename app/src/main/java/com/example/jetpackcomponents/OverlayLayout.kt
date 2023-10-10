package com.example.jetpackcomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Constraints

@Composable
fun OverlayLayout(
    modifier: Modifier = Modifier,
    content1: @Composable () -> Unit,
    content2: @Composable () -> Unit
) {
    Layout(
        modifier = modifier,
        content = {

                content1()


            content2()
        }
    ) { measurables, constraints ->
        val placeable1 = measurables[0].measure(constraints)
        val placeable2 = measurables[1].measure(constraints)

        layout(constraints.maxWidth, constraints.maxHeight) {
            // Place the first component at the top center
            placeable1.place(
                x = (constraints.maxWidth - placeable1.width)/2,
                y = 0
            )

            // Place the second component at the top left
            placeable2.place(
                x = (constraints.maxWidth - placeable2.width) / 2, // Center horizontally
                y = (constraints.maxHeight - placeable2.height) / 2 // Center vertically
            )
        }
    }
}
