package com.example.ubtraceui.screen.LostItemOwnerScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ubtraceui.screen.LostItemOwnerScreen.Components.ContentSectionLostItemOwner
import com.example.ubtraceui.screen.util.component.BottomBar
import com.example.ubtraceui.screen.util.component.TopAppBar

@Preview(showBackground = true)
@Composable
fun LostItemPostOwnerScreen(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = "POSTINGAN",
                onBackClick = {  },
            ) },
        content = { paddingValues -> ContentSectionLostItemOwner(paddingValues) },
        bottomBar = { BottomBar() }
    )
}