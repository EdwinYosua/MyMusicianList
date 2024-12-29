package com.edwinyosua.mymusicianlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.runtime.Composable
import com.edwinyosua.mymusicianlist.data.model.Musician
import com.edwinyosua.mymusicianlist.ui.menus.HomeScreen
import com.edwinyosua.mymusicianlist.ui.menus.MusicianProfileActivity
import com.edwinyosua.mymusicianlist.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO) //disable night mode in app

        setContent {
//            AppTheme {
                MainApp {
                    startActivity(MusicianProfileActivity.newIntent(this, it))
                }
//            }
        }
    }
}

@Composable
fun MainApp(navigateToProfile: (Musician) -> Unit) {
    HomeScreen(navigateToProfile = navigateToProfile)
}