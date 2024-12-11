package com.example.ubtraceui.screen.util.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R

@Composable
fun TopAppBar(
    title: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
            .shadow(elevation = 8.dp, spotColor = Color(0x26000000), ambientColor = Color(0x26000000))
            .background(color = Color(0xFFFFFFFF))
            .fillMaxWidth()
            .height(57.dp)

    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 8.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.vector),
                contentDescription = "Back",
                modifier = Modifier.size(24.dp)
            )
        }

        Text(
            text = title,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF000000),
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}



