package com.edwinyosua.mymusicianlist.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.edwinyosua.mymusicianlist.data.DataSource
import com.edwinyosua.mymusicianlist.data.model.Musician

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
            modifier = Modifier
        )
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen(navigateToProfile = {})
}