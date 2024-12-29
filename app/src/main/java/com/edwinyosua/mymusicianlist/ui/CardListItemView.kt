package com.edwinyosua.mymusicianlist.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edwinyosua.mymusicianlist.data.DataSource
import com.edwinyosua.mymusicianlist.data.model.Musician

@Composable
fun CardList(musician: Musician, navigateToProfile: (Musician) -> Unit) {
    OutlinedCard(
        colors = CardDefaults.cardColors(
            contentColor = MaterialTheme.colorScheme.background
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp)
    ) {
        Row(Modifier
            .clickable { navigateToProfile(musician) }) {
            Image(
                painter = painterResource(id = musician.profileImg),
                contentDescription = "Musician Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(80.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(14.dp))),
            )
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    text = musician.name,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 25.sp
                )
                Text(
                    text = musician.gender,
                    color = Color.Black
                )
                Text(
                    text = musician.age.toString(),
                    color = Color.Black
                )
            }
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    val musician = DataSource.musician
    CardList(musician, navigateToProfile = {})
}