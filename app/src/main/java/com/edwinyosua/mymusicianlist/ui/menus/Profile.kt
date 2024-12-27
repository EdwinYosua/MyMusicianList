package com.edwinyosua.mymusicianlist.ui.menus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edwinyosua.mymusicianlist.R
import com.edwinyosua.mymusicianlist.ui.theme.AppTheme

class UserProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                ProfileComponent()
            }
        }
    }
}

@Composable
fun ProfileComponent() {
    Scaffold(
        content = { paddingValues ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(paddingValues)
            ) {
                ProfilePicture()
                ProfileData()
            }
        }
    )
}

@Composable
fun ProfilePicture() {
    Image(
        painter = painterResource(R.drawable.edwinyosua),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(450.dp)
            .padding(28.dp)
            .clip(RoundedCornerShape(corner = CornerSize(100.dp)))
    )
}

@Composable
fun ProfileData() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Edwin Yosua Pebrian Kuway")
        Text(text = "edwinyosua88@gmail.com")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    AppTheme {
        ProfileComponent()
    }
}