package com.example.ubtraceui.screen.UploadPhotoScreen.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.ui.theme.UBTraceUITheme

@Composable
fun SubmitButton (
    onClick: () -> Unit,
    modifier: Modifier = Modifier) {

    Button(
        onClick = onClick,
        modifier = Modifier
            .width(183.dp)
            .height(53.dp)
            .background(color = Color(0xFF143D59), shape = RoundedCornerShape(size = 25.dp)),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF143D59))
    ) {
        Text(
            text = "Kirim",
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SubmitButtonPreview() {
    UBTraceUITheme {
        SubmitButton(onClick = {},
            )
    }
}
