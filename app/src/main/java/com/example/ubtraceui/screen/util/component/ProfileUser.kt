package com.example.ubtraceui.screen.util.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R

@Composable
fun ProfileUser (
    profileName: String,
    profileLocation: String,
    profilePicture: Int = R.drawable.profile_picture,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = profilePicture),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))


        Column {
            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = profileName,
                fontSize = 17.sp,
                lineHeight = 17.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2B2B2B),
            )

            Spacer(modifier = Modifier.width(2.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.map_marker),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(24.dp)
                )

                Spacer(modifier = Modifier.padding(2.dp))

                Text(
                    text = profileLocation,
                    fontSize = 15.sp,
                    lineHeight = 15.sp,
                    fontWeight = FontWeight.Light,
                    color = Color(0xFF2B2B2B),
                )
            }
        }
    }
}