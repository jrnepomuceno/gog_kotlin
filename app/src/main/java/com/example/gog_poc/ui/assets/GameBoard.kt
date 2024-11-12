package com.example.gog_poc.ui.assets

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GameBoard(){
    Box(modifier = Modifier.fillMaxSize().aspectRatio(1f)) {
        Column {
            for (rank in 8 downTo 1) {
                Row(modifier = Modifier.weight(1f)) {
                    for (file in 1..9) {
                        Square(
                            Modifier.weight(1f)
                            .fillMaxSize()
                            .border(width = 1.dp, color = Black)
                        )
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun GameBoardPreview() {
    GameBoard()
}