package com.example.ubtraceui.screen.UploadPhotoScreen.Components

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ubtraceui.R
import com.example.ubtraceui.ui.theme.UBTraceUITheme

@Composable
fun ImageUploader (
    selectedImageUri: Uri?,
    onImageSelected: (Uri?) -> Unit
) {
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        onImageSelected(uri)
    }


    Box(modifier = Modifier
        .width(288.dp)
        .height(194.dp)
        .background(Color(0xFF143D59))
        .clip(RoundedCornerShape(size = 10.dp))
        .clickable { launcher.launch("image") },
        contentAlignment = Alignment.Center
    ){
        if (selectedImageUri == null) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Box (
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .background(color = Color(0xFFFAFAFA), shape = RoundedCornerShape(size = 5.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.imageplace),
                        contentDescription = "Upload Image",
                        modifier = Modifier
                            .size(42.dp)
                    )
                }
                Text(
                    text = "Pilih Gambar",
                    fontSize = 14.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageUploaderPreview() {
    var selectedImageUri: Uri? = null
    UBTraceUITheme {
        ImageUploader(
            selectedImageUri = selectedImageUri,
            onImageSelected = { uri ->
                selectedImageUri = uri
            }
        )
    }
}

