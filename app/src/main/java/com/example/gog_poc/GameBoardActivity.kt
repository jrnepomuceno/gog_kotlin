package com.example.gog_poc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.gog_poc.ui.assets.GameBoard
import com.example.gog_poc.ui.theme.GoG_pocTheme

class GameBoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoG_pocTheme {
                GameBoard()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GameBoardActivityPreview(){
    GoG_pocTheme {
        GameBoard()
    }
}