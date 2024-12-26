package com.edwinyosua.mymusicianlist.data

import com.edwinyosua.mymusicianlist.R
import com.edwinyosua.mymusicianlist.data.model.Musician

object DataSource {

    val musician =
        Musician(
            id = 1,
            name = "Kanye",
            gender = "Male",
            age = 45,
            description = "Kanye is a musician, rapper, hip-hop artist, and also a fashion designer.",
            profileImg = R.drawable.kanye
        )

    val musicianList = listOf(
        musician,
        Musician(
            id = 2,
            name = "Tupac",
            gender = "Male",
            age = 25,
            description = "Tupac Shakur was an influential rapper, actor, and activist, known for his impactful lyrics and role in shaping hip-hop culture.",
            profileImg = R.drawable.tupac
        ),
        Musician(
            id = 3,
            name = "Playboi Carti",
            gender = "Male",
            age = 26,
            description = "Playboi Carti is a rapper known for his experimental music style and unique vocal delivery.",
            profileImg = R.drawable.playboic
        ),
        Musician(
            id = 4,
            name = "The Weeknd",
            gender = "Male",
            age = 32,
            description = "The Weeknd is a Canadian singer, songwriter, and producer, known for his atmospheric music and distinctive voice.",
            profileImg = R.drawable.weeknd
        ),
        Musician(
            id = 5,
            name = "Lady Gaga",
            gender = "Female",
            age = 37,
            description = "Lady Gaga is a pop icon, actress, and activist, celebrated for her versatility, bold performances, and unique fashion sense.",
            profileImg = R.drawable.gaga
        ),
        Musician(
            id = 6,
            name = "Hikaru Utada",
            gender = "Female",
            age = 40,
            description = "Hikaru Utada is a renowned Japanese-American singer-songwriter, famous for her contributions to J-pop and video game soundtracks like Kingdom Hearts.",
            profileImg = R.drawable.hikaru
        ),
        Musician(
            id = 7,
            name = "Yuka Kitamura",
            gender = "Female",
            age = 39,
            description = "Yuka Kitamura is a Japanese composer best known for her work on soundtracks for video games such as the Dark Souls series.",
            profileImg = R.drawable.yuka
        ),
        Musician(
            id = 8,
            name = "Drake",
            gender = "Male",
            age = 37,
            description = "Drake is a Canadian rapper, singer, and actor, one of the most successful and influential music artists of his generation.",
            profileImg = R.drawable.drake
        ),
        Musician(
            id = 9,
            name = "Travis Scott",
            gender = "Male",
            age = 32,
            description = "Travis Scott is a rapper, producer, and songwriter known for his genre-bending music and high-energy performances.",
            profileImg = R.drawable.travis
        ),
        Musician(
            id = 10,
            name = "Don Toliver",
            gender = "Male",
            age = 29,
            description = "Don Toliver is an American rapper and singer known for his melodic sound and collaborations with prominent artists.",
            profileImg = R.drawable.toliver
        )
    )
}