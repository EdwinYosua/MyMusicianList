package com.edwinyosua.mymusicianlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.edwinyosua.mymusicianlist.data.model.Musician
import com.edwinyosua.mymusicianlist.ui.menus.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainApp{} }
    }
}

@Composable
fun MainApp(navigateToProfile: (Musician) -> Unit) {
    HomeScreen(navigateToProfile = navigateToProfile)
}