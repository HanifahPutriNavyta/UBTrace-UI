package com.example.ubtraceui.screen.LostItemFinderScreen.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R
import com.example.ubtraceui.screen.util.component.ProfileUser

@Composable
fun ContentSectionLostItemFinder (paddingValues: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(color = Color(0xFFFFFFFF))
            .padding(16.dp)
    ) {
        ProfileUser(
            profileName = "Arifal Aghna",
            profileLocation = "Fakultas Ilmu Komputer"
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.tumbler_image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(277.dp)
                .clip(RoundedCornerShape(10.dp))
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x40000000),
                    ambientColor = Color(0x40000000)
                )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "2.5 Km",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFB2B2B2),
            )

            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(4.dp)
                    .background(Color(0xFFB2B2B2), CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "5 Menit yang lalu",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFB2B2B2),
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Tumbler Hijau",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF000000),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Terakhir kali saya memakai Tumbler adalah sekitar jam 12.50, selepas sholat dhuhr dan hendak menuju kelas. Apabila menemukan mohon hubungi saya. Penemu akan saya berikan tips.",
            fontSize = 16.sp,
            lineHeight = 27.2.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF5E5E5E),
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ContentSectionLostItemFinderPreview() {
    ContentSectionLostItemFinder(paddingValues = PaddingValues())
}
