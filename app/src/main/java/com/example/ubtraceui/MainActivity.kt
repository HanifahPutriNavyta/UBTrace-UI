package com.example.ubtraceui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ubtraceui.screen.LostItemFinderScreen.LostItemPostFinderScreen
import com.example.ubtraceui.ui.theme.UBTraceUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UBTraceUITheme {
                LostItemPostFinderScreen(
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LostItemPostFinderScreenPreview() {
    UBTraceUITheme {
        LostItemPostFinderScreen()
    }
}



