package com.example.ubtraceui.screen.UploadPhotoScreen


import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R
import com.example.ubtraceui.screen.UploadPhotoScreen.Components.ImageUploader
import com.example.ubtraceui.screen.UploadPhotoScreen.Components.SubmitButton
import com.example.ubtraceui.screen.util.component.ProfileUser
import com.example.ubtraceui.screen.util.component.TopAppBar
import com.example.ubtraceui.ui.theme.UBTraceUITheme


@Composable
fun UploadPhotoScreen(paddingValues: PaddingValues) {
    var selectedImageUri by remember { mutableStateOf<Uri?>(null) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = "POSTINGAN",
                onBackClick = { }
            )
        },

        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .background(color = Color(0xFFFFFFFF))
            ) {

                // Profil User
                ProfileUser(
                    profileName = "Arifal Aghna",
                    profileLocation = "Fakultas Ilmu Komputer"
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Image Tumbler
                Image(
                    painter = painterResource(id = R.drawable.tumbler_image),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(277.dp)
                        .height(300.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color(0x40000000),
                            ambientColor = Color(0x40000000)
                        )
                        .align(Alignment.CenterHorizontally)
                )

                // "Unggah Bukti"
                Box (
                    modifier = Modifier
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color(0x40000000),
                            ambientColor = Color(0x40000000)
                        )
                        .fillMaxSize()
                        .background(color = Color(0xFFFFDE59)),
                    contentAlignment = Alignment.TopCenter
                ){

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Spacer(modifier = Modifier.height(30.dp))
                        Text(
                            text = "Unggah Bukti",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF2F2F2F),
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Area Upload Gambar
                        ImageUploader(
                            selectedImageUri = selectedImageUri,
                            onImageSelected = { uri -> selectedImageUri = uri }
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Tombol Submit
                        SubmitButton(
                            onClick = { /* Handle Submit */ },
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun UploadPhotoScreenPreview() {
    UBTraceUITheme {
        UploadPhotoScreen(paddingValues = PaddingValues())
    }
}