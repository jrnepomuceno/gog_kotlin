package com.example.gog_poc.ui.assets

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Square(mod: Modifier){
    Canvas(modifier = mod) {
        drawRect(color = White)
    }
}

@Preview
@Composable
fun SquarePreview(){
    Square(Modifier.fillMaxSize(1f))
}