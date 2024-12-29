package com.edwinyosua.mymusicianlist.ui.menus

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.edwinyosua.mymusicianlist.data.DataSource
import com.edwinyosua.mymusicianlist.data.model.Musician
import com.edwinyosua.mymusicianlist.ui.CardList

@Composable
fun HomeScreen(navigateToProfile: (Musician) -> Unit) {
    val musicians = remember { DataSource.musicianList }
    Column {
        HomeComponent()
        Box(Modifier.fillMaxSize()) {
            Box(Modifier.align(Alignment.BottomCenter)) {
                LazyColumn(
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    items(musicians) { musician ->
                        CardList(musician, navigateToProfile)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeComponent() {
    Column {
        TopAppBar(
            title = { Text("Home") },
            actions = {
                val context = LocalContext.current
                Icon(
                    Icons.Filled.AccountCircle,
                    contentDescription = "about_page",
                    modifier = Modifier
                        .padding(8.dp)
                        .size(44.dp)
                        .clickable {
                            context.startActivity(
                                Intent(
                                    context,
                                    UserProfile::class.java
                                )
                            )
                        }
                )
            }
        )
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen(navigateToProfile = {})
}