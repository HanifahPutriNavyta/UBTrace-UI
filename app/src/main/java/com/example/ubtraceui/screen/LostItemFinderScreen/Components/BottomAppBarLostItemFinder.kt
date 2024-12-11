package com.example.ubtraceui.screen.LostItemFinderScreen.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R

@Composable
fun BottomAppBarLostItemFinder() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(99.dp)
            .background(
                color = Color(0xFFFFDE59),
                shape = RoundedCornerShape(
                    topStart = 20.dp,
                    topEnd = 20.dp,
                    bottomStart = 0.dp,
                    bottomEnd = 0.dp
                )
            )
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.location_icon1),
                    contentDescription = "Location",
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .size(45.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.message_notif),
                    contentDescription = "Message",
                    modifier = Modifier
                        .size(45.dp)
                )
            }

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFF143D59)),
                shape = RoundedCornerShape(25.dp),
                modifier = Modifier
                    .width(203.dp)
                    .height(56.dp)
            ){
                Text(
                    text = "Kembalikan",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.location_icon2),
                    contentDescription = null,
                    contentScale = ContentScale.None,
                    modifier = Modifier
                        .padding(0.dp)
                        .width(34.dp)
                        .height(34.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomAppBarLostItemFinderPreview() {
    BottomAppBarLostItemFinder()
}