package com.example.ubtraceui.screen.LostItemFinderScreen

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ubtraceui.screen.LostItemFinderScreen.Components.BottomAppBarLostItemFinder
import com.example.ubtraceui.screen.LostItemFinderScreen.Components.ContentSectionLostItemFinder
import com.example.ubtraceui.screen.util.component.TopAppBar

@Preview(showBackground = true)
@Composable
fun LostItemPostFinderScreen(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = "POSTINGAN",
                onBackClick = {  },
        ) },
        content = { paddingValues -> ContentSectionLostItemFinder(paddingValues) },
        bottomBar = { BottomAppBarLostItemFinder() }
    )
}






