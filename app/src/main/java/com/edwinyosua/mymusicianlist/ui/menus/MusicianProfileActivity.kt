package com.edwinyosua.mymusicianlist.ui.menus

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.edwinyosua.mymusicianlist.data.model.Musician

class MusicianProfileActivity : ComponentActivity() {


    private val model: Musician by lazy {
        intent?.getSerializableExtra(MUSICIAN_ID) as Musician
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicianDetailsComponent(model)
        }
    }

    companion object {
        private const val MUSICIAN_ID = "singer_id"
        fun newIntent(context: Context, musician: Musician) =
            Intent(context, MusicianProfileActivity::class.java).apply {
                putExtra(MUSICIAN_ID, musician)
            }
    }
}
