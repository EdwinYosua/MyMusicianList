package com.edwinyosua.mymusicianlist.ui.menus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edwinyosua.mymusicianlist.data.DataSource
import com.edwinyosua.mymusicianlist.data.model.Musician
import com.edwinyosua.mymusicianlist.ui.theme.AppTheme

@Composable
fun MusicianDetailsComponent(musician: Musician) {
    val scrollState = rememberScrollState()

    Scaffold(
        content = { paddingValues ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(paddingValues)
            ) {
                BoxWithConstraints(modifier = Modifier.weight(1f)) {
                    Box {
                        Surface {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .verticalScroll(scrollState)
                            ) {
                                MusicianImg(musician, this@BoxWithConstraints.maxHeight)
                                MusicianData(musician, this@BoxWithConstraints.maxHeight)
                            }
                        }
                    }
                }
            }
        }
    )
}

@Composable
private fun MusicianImg(musician: Musician, containerHeight: Dp) {
    Image(
        contentDescription = null,
        painter = painterResource(id = musician.profileImg),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .padding(28.dp)
            .clip(RoundedCornerShape(corner = CornerSize(100.dp)))
    )
}

@Composable
private fun MusicianData(musician: Musician, containerHeight: Dp) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = musician.name,
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )

        MusicianDataComponent("Age", musician.age.toString())
        MusicianDataComponent("Gender", musician.gender)
        MusicianDataComponent("Description", musician.description)


        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))

    }
}

@Composable
private fun MusicianDataComponent(dataLabel: String, data: String) {

    Column {
        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp, horizontal = 0.dp))
        Text(
            text = dataLabel,
            style = MaterialTheme.typography.labelSmall
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = data)
    }


}

@Preview(showBackground = true)
@Composable
fun MusicianDetailsPreview() {
    AppTheme {
        val musician = DataSource.musician
        MusicianDetailsComponent(musician)
    }
}